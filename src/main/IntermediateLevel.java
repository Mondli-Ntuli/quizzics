/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mondl
 */
public class IntermediateLevel extends QuizLevel {
//constructor
    public IntermediateLevel() {
        super("INTERMEDIATE", 2, 50);
        populateQuestions();
    }
//private method, generates questions
    private void populateQuestions() {
        // 5 id hard/easy questions
        questions.add(new Question("Given 2^x + 2^(x+2) = -5y + 20, express 2^x in terms of y:", 
            new String[]{"2^x = -y + 4", "2^x = -5y + 20", "2^x = (-5y + 20)/3", "2^x = -y + 5"}, 'A', "EASY"));
        questions.add(new Question("Given 2^x + 2^(x+2) = -5y + 20, how many real solutions for x if y = -4?", 
            new String[]{"1 real solution (x = 3)", "2 real solutions", "No real solutions", "Infinitely many"}, 'A', "EASY"));
        questions.add(new Question("Calculate closest integer approximation: (5^2007 + 5^2010) / (5^2008 + 2 * 5^2009)", 
            new String[]{"23", "25", "5", "125"}, 'A', "EASY"));
        questions.add(new Question("If f(x) = √(4x) and g(x) = x^2, determine f(g(9)):", 
            new String[]{"18", "36", "81", "9"}, 'A', "EASY"));
        questions.add(new Question("The graph 4y - x = 4 is reflected across line y = x. What is the new equation?", 
            new String[]{"4x - y = 4", "y - 4x = 4", "4y + x = 4", "x + y = 4"}, 'A', "EASY"));
        
        // these are the hard question 
        questions.add(new Question("Given f(x) = 3(x-1)^2 + 5 and g(x) = 3, is g(x) = f(x) possible?", 
            new String[]{"No, because min value of f(x) is 5, which is > 3", "Yes, at x = 1", "Yes, at x = 0", "No, because g(x) is constant"}, 'A', "HARD"));
        questions.add(new Question("Given f(x) = g(x) + k has two unequal real roots, solve for k:", 
            new String[]{"k > -2", "k < 2", "k = 0", "k > 5"}, 'A', "HARD"));
    }
}