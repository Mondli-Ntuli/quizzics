/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mondl
 */
public class HardLevel extends QuizLevel {
//constructor
    public HardLevel() {
        super("HARD", 3, 50);
        populateQuestions();
    }
//private method,opulates questions
    private void populateQuestions() {
        // 7 hard questions as this is the hard level
        questions.add(new Question("Simplify: (3^2015 + 3^2013) / (9^1006)", 
            new String[]{"30", "10", "9", "3"}, 'A', "HARD"));
        questions.add(new Question("Given f(x) = 3(x-1)^2 + 5 and g(x) = 3, is g(x) = f(x) possible?", 
            new String[]{"No, because min value of f(x) is 5, which is > 3", "Yes, at x = 1", "Yes, at x = 0", "No, because g(x) is constant"}, 'A', "HARD"));
        questions.add(new Question("Given f(x) = g(x) + k has two unequal real roots, solve for k:", 
            new String[]{"k > -2", "k < 2", "k = 0", "k > 5"}, 'A', "HARD"));
        questions.add(new Question("Calculate values of ratio x/y for x^2 + 5xy + 6y^2 = 0:", 
            new String[]{"x/y = -2 or x/y = -3", "x/y = 2 or x/y = 3", "x/y = -1 or x/y = -6", "x/y = 5/6"}, 'A', "HARD"));
        questions.add(new Question("Solve system: 3^(x-10) = 3^(3x) and y^2 + x = 20:", 
            new String[]{"x = -5, y = ±5", "x = 5, y = ±3", "x = -10, y = 0", "x = 0, y = ±√20"}, 'A', "HARD"));
        questions.add(new Question("Solve system: 2x + 7 = 3 and x^2 + 1 + x = y^2:", 
            new String[]{"x = -2, y = ±√3", "x = 2, y = ±3", "x = -2, y = ±1", "x = 1, y = ±2"}, 'A', "HARD"));
        questions.add(new Question("Solve system: 2 + 1 = -2x and -2x^2 + 8xy + 42 = y:", 
            new String[]{"x = -3/2, y = -75/13", "x = 3/2, y = 5", "x = -1, y = 2", "x = -2, y = 10"}, 'A', "HARD"));
    }
}