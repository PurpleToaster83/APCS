Project Title:  GradesV2 / GradesV2.java
Purpose of Project: Use int and doubel variables in print() statements of arithmetic operations
Date: 08/16/24
Author: William Van Uitert


Post-Mortem Review:

What went Right:
    I felt I understood the premise of the activity and was able to use the information from the lessons to get the correct output.

What went Wrong:
    I originally forgot to cast the average number to get the correct average values. However, I soon remembered that the average was a combination of int type variables so I would need to cast
    and I quickly fixed it. It was also tedius to have to type out the same block when it could have been more efficient to use a loop and array.

In the Future:
    In the future I would like to use a integer array to hold the tests scores and then use a for loop that iterates over the length of the array. This would make it a lot easier to add more test scores
    and make the program less 'hard-coded' and instead more flexible. I think the following code would work a lot better for this program:

    int[] testScores = new int[]{95, 73, 91, 82}, ...;

    for(int i = 0; i < testScores.length; i++) {

        totalPoints += testScores[i];
        numTests++;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + " Test Grade: " + testScores[i] + " Average Score: " + average);

    }