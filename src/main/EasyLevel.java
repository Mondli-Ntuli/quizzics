/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mondl
 */
public class EasyLevel extends QuizLevel {
//constructor
    public EasyLevel() {
        super("EASY", 1, 50); // Calls QuizLevel constructor
        populateQuestions();
    }
//private method,populates questions
    private void populateQuestions() {
        // 6 Easy Questions + 1 Hard Question
        questions.add(new Question("Solve for x: x^2 = 5x - 4", 
            new String[]{"x = 1 or x = 4", "x = -1 or x = -4", "x = 2 or x = 3", "x = 0 or x = 5"}, 'A', "EASY"));
        questions.add(new Question("Solve for x: x(x - 3) = -3", 
            new String[]{"x = (3 ± i√3)/2", "x = 1 or x = 3", "x = -1 or x = -3", "No real solutions"}, 'A', "EASY"));
        questions.add(new Question("Solve inequality: 3 - x < 2x^2", 
            new String[]{"x < -3/2 or x > 1", "-3/2 < x < 1", "x > 1", "x < -1"}, 'A', "EASY"));
        questions.add(new Question("Solve for x: (x - 3)(x + 5) = 9", 
            new String[]{"x = 4 or x = -6", "x = 3 or x = -5", "x = 2 or x = -4", "x = 6 or x = -4"}, 'A', "EASY"));
        questions.add(new Question("Solve system: 3y = 2x and x^2 - y^2 + 2x - y = 1", 
            new String[]{"x = 1, y = 2/3 or x = -9/5, y = -6/5", "x = 3, y = 2", "x = 0, y = 0", "x = 2, y = 3"}, 'A', "EASY"));
        questions.add(new Question("Solve inequality: -3(x + 7)(x - 5) < 0", 
            new String[]{"x < -7 or x > 5", "-7 < x < 5", "x > 5", "x < -7"}, 'A', "EASY"));
        
        // 1 Hard Question
        questions.add(new Question("Simplify: (3^2015 + 3^2013) / (9^1006)", 
            new String[]{"30", "10", "9", "3"}, 'A', "HARD"));
    }
}