/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author mondl
 */
public class Question {
    // this is encapsilatio,, the hidimg of data
    private String prompt;
    private String[] options;
    private char correctAnswer;
    private String difficulty; // easy , hard or intermediate you chse
    private int points;
    
// the constructo because it has the same name as the name of the class
    public Question(String prompt, String[] options, char correctAnswer, String difficulty) {
        this.prompt = prompt;
        this.options = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
        this.difficulty = difficulty;
        this.points = difficulty.equalsIgnoreCase("HARD") ? 20 : 10;
    }
// the get methods, they are return types
    public String getPrompt() { return prompt; }
    public String[] getOptions() { return options; }
    public char getCorrectAnswer() { return correctAnswer; }
    public String getDifficulty() { return difficulty; }
    public int getPoints() { return points; }
    
// display method
    public void displayQuestion(int qNum) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Q" + qNum + " [" + difficulty + " - " + points + " pts]: " + prompt);
        char label = 'A';
        for (String opt : options) {
            System.out.println("   " + label + ") " + opt);
            label++;
        }
    }
}
