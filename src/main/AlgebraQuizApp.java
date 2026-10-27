/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mondl
 */

import java.util.Scanner;

public class AlgebraQuizApp {

    //start of the main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n==================================================");
            System.out.println("          WELCOME TO ALGEBRA MATH QUIZ APP        ");
            System.out.println("==================================================");
            System.out.println("Select a Mode:");
            System.out.println("  1. Practice Mode (20 Questions)");
            System.out.println("  2. Timed Quiz Mode (Easy -> Intermediate -> Hard)");
            System.out.println("  3. Exit Application");
            System.out.print("Enter choice (1-3): ");

            String choice = scanner.nextLine().trim();
//swtich statemnts to make choose modes
            switch (choice) {
                case "1":
                    PracticeMode practice = new PracticeMode();
                    practice.runPracticeMode(scanner);
                    break;

                case "2":
                    runTimedQuizMode(scanner);
                    break;

                case "3":
                    System.out.println("\nThank you for using the Algebra Math Quiz App!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
// the is the quize controller
    private static void runTimedQuizMode(Scanner scanner) {
        QuizLevel easyLevel = new EasyLevel();
        QuizLevel interLevel = new IntermediateLevel();
        QuizLevel hardLevel = new HardLevel();
//easy level
        if (!easyLevel.runLevel(scanner)) return;
        System.out.print("\nPress ENTER to advance to Level 2 (Intermediate)...");
        scanner.nextLine();
// midease-hard level
        if (!interLevel.runLevel(scanner)) return;
        System.out.print("\nPress ENTER to advance to Level 3 (Hard)...");
        scanner.nextLine();
//hard level
        if (hardLevel.runLevel(scanner)) {
            System.out.println("\n🎉 CONGRATULATIONS! You completed ALL 3 LEVELS!");
        }
     // a loop to return to menu   
    }
    
}
