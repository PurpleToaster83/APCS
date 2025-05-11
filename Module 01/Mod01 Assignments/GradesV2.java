import java.util.ArrayList;

/**
 * The purpose of this program is to count the number of
 * tickets sold and the amount of money received.
 * 
 * @author William Van Uitert
 * @version 08/16/24
 */

public class GradesV2
{
    public static void main(String[ ] args)
    {
        // local variables
        int numTests = 0; // counts number of tests
        int testGrade = 0; // individual test grade
        int totalPoints = 0; // total points for all tests
        double average = 0.0; // average grade

        // calculations and print for first test
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);
        
        // calculations and print for second test
        testGrade = 73;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for third test
        testGrade = 91;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for fourth test
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for fifth test
        testGrade = 68;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for sixth test
        testGrade = 93;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for seventh test
        testGrade = 24;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for eighth test
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

        // calculations and print for ninth test
        testGrade = 77;
        totalPoints += testGrade;
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testGrade + " Average Score: " + average);

    }//end of main method
}//end of class