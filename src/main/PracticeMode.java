/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mondl
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeMode {
    //encapsulation
    private List<Question> practiceQuestions;
//constructor
    public PracticeMode() {
        practiceQuestions = new ArrayList<>();
        populateQuestions();
    }
//priavte method, populates questions
    private void populateQuestions() {
        
    }
//run practice method
    public void runPracticeMode(Scanner scanner) {
        System.out.println("\n==================================================");
        System.out.println("               PRACTICE MODE (20 QUESTIONS)       ");
        System.out.println("==================================================");

        int totalPoints = 0;
        int correctCount = 0;
        int totalQuestions = practiceQuestions.size();
//for loop, repeats throught the practice questions
        for (int i = 0; i < totalQuestions; i++) {
            Question q = practiceQuestions.get(i);
            // Display question prompt and options A, B, C, D
            q.displayQuestion(i + 1);
//checks if user answer is correct
            char userAns = getUserAnswer(scanner);
//evaluates the answer
            if (userAns == q.getCorrectAnswer()) {
                System.out.println("CORRECT! + " + q.getPoints() + " points.");
                totalPoints += q.getPoints();
                correctCount++;
            } else {
                System.out.println("INCORRECT. Correct answer was: " + q.getCorrectAnswer());
            }
        }
//calculate the percentage 
        double accuracy = ((double) correctCount / totalQuestions) * 100;
        System.out.println("\n--- PRACTICE MODE COMPLETED ---");
        System.out.println("Accuracy: " + String.format("%.1f", accuracy) + "%");
        displayReward(accuracy);
    }
//get user answer meyhod
    private char getUserAnswer(Scanner scanner) {
        while (true) {
            System.out.print("Your Answer (A, B, C, or D): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.length() == 1 && (input.charAt(0) >= 'A' && input.charAt(0) <= 'D')) {
                return input.charAt(0);
            }
            System.out.println("Invalid input! Enter A, B, C, or D.");
        }
    }
//display reward method, or medals using if statements
    private void displayReward(double accuracy) {
        if (accuracy >= 85.0) System.out.println("Medal: [ GOLD MEDAL ]");
        else if (accuracy >= 70.0) System.out.println("Medal: [ SILVER MEDAL ]");
        else if (accuracy >= 50.0) System.out.println("Medal: [ BRONZE MEDAL ]");
        else System.out.println("Medal: [ PARTICIPATION BADGE ]");
    }
}