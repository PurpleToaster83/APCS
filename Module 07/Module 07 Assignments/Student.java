/*
 * Purpose: to define a sutdent class
 * 
 * @author William Van Uitert
 * @version 01/20/25
 */

import java.util.ArrayList;

public class Student {
    private String name;
    private int[] quizScores = new int[5];

    public Student(String name, int[] quizScores) {
        this.name = name;
        this.quizScores = quizScores;
    }

    public double numberToScore(int quizNum) {
        return quizScores[quizNum];
    }

    public void setQuiz(int quizNum, int quizScore) {
        quizScores[quizNum] = quizScore;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        String printOut = String.format("%s", this.name);
        for(int quiz : quizScores) {
            printOut += "\t" + quiz;
        }
        return printOut;
    }
}
