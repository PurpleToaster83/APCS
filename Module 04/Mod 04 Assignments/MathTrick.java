/**
 * Purpose
 * 
 * @author William Van Uitert
 * @version 11/06/24
 */

 import java.lang.Math;

 public class MathTrick {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS AT ALL,  AND DO NOT CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

        num = (int)(Math.random() * 899) + 100;
        firstDigit = (int)(num/100);
        lastDigit = (int)(num % 10);

        while(Math.abs(firstDigit - lastDigit) < 2) {
            num = (int)(Math.random() * 899) + 100;
            firstDigit = (int)(num/100);
            lastDigit = (int)(num % 10);
        }
		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
        int reversed = 0;
        int firstDigit = 0;
        int middleDigit = 0;
        int lastDigit = 0;

        firstDigit = (int)(num / 100);
        middleDigit = (int)((num / 10) % 10);
        lastDigit = (int)(num % 10);
        reversed = (100 * lastDigit) + (10 * middleDigit) + firstDigit;
        return reversed;
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{
        String newString = "";
        
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                newString = newString + "Y";
            }
            else if(str.charAt(i) == '1') {
                newString = newString + "M";
            }
            else if(str.charAt(i) == '2') {
                newString = newString + "P";
            }
            else if(str.charAt(i) == '3') {
                newString = newString + "L";
            }
            else if(str.charAt(i) == '4') {
                newString = newString + "R";
            }
            else if(str.charAt(i) == '5') {
                newString = newString + "O";
            }
            else if(str.charAt(i) == '6') {
                newString = newString + "F";
            }
            else if(str.charAt(i) == '7') {
                newString = newString + "A";
            }
            else if(str.charAt(i) == '8') {
                newString = newString + "I";
            }
            else if(str.charAt(i) == '9') {
                newString = newString + "B";
            }
        }
        return newString;
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		// complete the method
        String revString = "";

        for(int j = str.length() - 1; j >= 0; j--) {
            revString = revString + str.substring(j, j+1);
        }
        return revString;
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int randNum = getRandomNum();
//		2.	Now reverse the digits to form a second number.
        int revNum = reverseDigits(randNum);
//		3.	Subtract the smaller number from the larger one.
        int diff = Math.abs(randNum - revNum);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
        int revDiff = reverseDigits(diff) + diff;
//		5.	Multiply by one million.
        int num5 = revDiff * (int)(Math.pow(10, 6));
//		6.	Subtract 733,361,573.
        int num6 = num5 - 733361573;
        String num6S = String.valueOf(num6);
//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        String replacedString = replaceLtr(String.valueOf(num6S));
//		8.	Now reverse the letters in the string to read your message backward.
        String reverseString = reverseString(replacedString);

        System.out.println("The starting number: " + randNum);
        System.out.println("The reversed number: " + revNum);
        System.out.println("The difference is: " + diff);
        System.out.println("The reversed number added to difference: " + revDiff);
        System.out.println("Number x one million: " + num5);
        System.out.println("The number subtracted and converted to string: " + num6S);
        System.out.println("Replaced string: " + replacedString);
        System.out.println("Reversed string: " + reverseString);
	} // end main
} // end class