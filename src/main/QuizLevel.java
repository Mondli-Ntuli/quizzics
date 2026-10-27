package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class QuizLevel {
    // protects the variables
    protected String levelName;
    protected int levelNumber;
    protected int requiredPoints;
    protected List<Question> questions;

    //constructor, same name as class
    public QuizLevel(String levelName, int levelNumber, int requiredPoints) {
        this.levelName = levelName;
        this.levelNumber = levelNumber;
        this.requiredPoints = requiredPoints;
        this.questions = new ArrayList<>();
    }
//run level ethod
    public boolean runLevel(Scanner scanner) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("      LEVEL " + levelNumber + " (" + levelName + ") - " + questions.size() + " QUESTIONS");
        System.out.println("--------------------------------------------------");
        System.out.println("Rule: You have 15 seconds per question.");
        System.out.println("Unlock Threshold: You need at least " + requiredPoints + " points to pass!\n");

        int levelPoints = 0;
        int levelCorrect = 0;
        int timeLimitSec = 15;
        
// ftor loop,repeats thruogh each question in the levels
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            q.displayQuestion(i + 1);
            System.out.println("[TIMER] 15 seconds limit. Enter answer (A, B, C, D):");
//reads start time in milliseconds
            long startTime = System.currentTimeMillis();
            //get correct answeer from the user
            char userAns = getUserAnswer(scanner);
            //read endtime in milliseconds
            long endTime = System.currentTimeMillis();
//calculates passed time/ elapsed time in seconds
            long elapsedSec = (endTime - startTime) / 1000;
//if else statemens, set the timer
            if (elapsedSec > timeLimitSec) {
                System.out.println("TIME'S UP! (" + elapsedSec + "s taken). Marked Incorrect.");
                System.out.println("Correct answer was: " + q.getCorrectAnswer());
            } else if (userAns == q.getCorrectAnswer()) {
                System.out.println("CORRECT! (Answered in " + elapsedSec + "s) +" + q.getPoints() + " pts");
                levelPoints += q.getPoints();
                levelCorrect++;
            } else {
                System.out.println("INCORRECT! (Answered in " + elapsedSec + "s). Correct answer: " + q.getCorrectAnswer());
            }
        }
//displays what happend in the levels, or summery
        System.out.println("\n--- LEVEL " + levelNumber + " RESULTS ---");
        System.out.println("Points Scored : " + levelPoints + " pts");
        System.out.println("Questions     : " + levelCorrect + " / " + questions.size() + " Correct");
//unlocks treashold, points 
        if (levelPoints >= requiredPoints || levelCorrect >= 5) {
            System.out.println(">>> SUCCESS: You passed Level " + levelNumber + " (" + levelName + ")!");
            return true;
        } else {
            System.out.println(">>> FAILED: You did not reach the " + requiredPoints + " points required to advance.");
            return false;
        }
    }
//gets user answer method
    protected char getUserAnswer(Scanner scanner) {
        while (true) {
            System.out.print("Your Answer (A, B, C, or D): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1 && (input.charAt(0) >= 'A' && input.charAt(0) <= 'D')) {
                return input.charAt(0);
            }
            System.out.println("Invalid input! Please enter A, B, C, or D.");
        }
    }
}
