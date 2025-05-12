/*
 * Purpose: to create arrays of objects
 * 
 * @author William Van Uitert
 * @version 12/22/24
 */

public class Student {
    int[] quizGrades;
    String name;

    public Student(int[] quizGrades, String name) {
        this.quizGrades = quizGrades;
        this.name = name;
    }

    public double diff(int indexQ1, int indexQ2) {
        return quizGrades[indexQ2] - quizGrades[indexQ1];
    }

    public double average() {
        int sum = 0;
        for(int i = 0; i < quizGrades.length; i++) {
            sum+= quizGrades[i];
        }
        return sum / (double)quizGrades.length;
    }

    public int getQuiz(int index) {
        return quizGrades[index];
    }

    public void setQuiz(int index, int value) {
        quizGrades[index] =  value;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String toString() {
        String returnString = String.format("%s", name);
        for(int j = 0; j < quizGrades.length; j++) {
            returnString += String.format("%15.1f", (double)quizGrades[j]);
        }
        returnString += String.format("%15.1f %15.2f", diff(0, 1), average());
        return returnString;
    }
}
