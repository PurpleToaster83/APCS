/*
 * Purpose: to create arrays of objects
 * 
 * @author William Van Uitert
 * @version 12/22/24
 */

import java.util.Random;

public class StudentTester {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("\t\t\tQuiz Results");
        System.out.println("Student Name\tQuiz1 Grade\tQuiz2 Grade\tDifference\tAverage");
        for(int h = 0; h <= 72; h++) {
            System.out.print("=");
        }
        System.out.println();

        String baseName = "Student ";
        int numStudents = 7;
        Student[] students = new Student[numStudents];
        int numQuiz = 2;

        for(int k = 0; k < numStudents; k++) {

            int[] quizScores = new int[numQuiz];
            for(int q = 0; q < numQuiz; q++) {
                quizScores[q] = random.nextInt(100);
            }
            students[k] = new Student(quizScores, baseName + (char)(65 + k));
        }

        for(int w = 0; w < numStudents; w++) {
            System.out.println(students[w].toString());
        }
    }
}