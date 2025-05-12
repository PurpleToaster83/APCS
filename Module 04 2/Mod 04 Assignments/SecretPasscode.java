/*
 * Purpose: to write a program that generates a random password
 * 
 * @author William Van Uitert
 * @version 11/05/24
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class SecretPasscode {
    public static void main (String [ ] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        File file = new File("passcodes.txt");
        PrintWriter outFile = new PrintWriter(file);
        Random random = new Random();
        int passwordCount = 0;

        boolean continuePrgm = true;

        System.out.println("Welcome to a simple password generator.");
        System.out.println("The password will include loewercase, uppercase, and numbers.");

        //create a loop to generate passwords
        while (continuePrgm) {
            System.out.print("Enter a password length (6 or more): ");
            int length = Integer.parseInt(in.next());
            System.out.println();
            String password = "";

            //check that password is correct length
            if(length < 6) {
                System.out.println("\tPassword length too short. Please try again.");
                continue;
            }
            
            //randomly select alphanumeric characters
            for(int i = 1; i <= length; i++) {
                char nextDigit;

                //select between capital, lowercase, and numbers and then choose
                int charType = random.nextInt(3);   
                if (charType == 0) {
                    nextDigit = (char)((Math.random() * 9) + 48);
                }
                else if (charType == 1){
                    nextDigit = (char)((Math.random() * 25) + 65);
                }
                else {
                    nextDigit = (char)((Math.random() * 25) + 97);
                }

                //append new digit to password
                password = password + nextDigit;
            }

            passwordCount++;

            //write the password number and password
            outFile.println(passwordCount + ". " + password);

            //ask user if they want to create another password
            System.out.println("A password has been written to the text file");
            System.out.print("Would you like to generate another password?\t Y/N ");
            String response = in.next();
            if (response.equals("N") || response.equals("n")) {
                continuePrgm = false;
            }
        }

        outFile.close();

        Scanner inFile = new Scanner(file);
        System.out.println("Thank you for useing the Pass Code Generator.");
        System.out.println();
        System.out.println("Here are your randomly generated codes:");
        String token = "";

        //display the passwords
        while(inFile.hasNextLine()) {
            token = inFile.nextLine();
            System.out.println(token);
        }
        
        inFile.close();
        System.out.println();
    }//end of main method
}
