/*
 *Purpose: to calculate someones BMI based on their weight and height
 *  
 * @author William Van Uitert
 * @version 09/11/2024
 */

import java.util.lang.Math;
import java.util.Scanner;

public class BMI
{
    
    public static void main(String[] args)
    {
        double feetToInches = 12;
        double inchesToMeters = 0.0254;
        double lbsToKg = 0.453592;

        Scanner in = new Scanner(System.in);

        // collect information from the user
        System.out.println("Please Enter the Following Information");

        System.out.print("Name (first last):");
        String firstName = in.next();
        String lastName = in.nextLine();
        
        System.out.print("Height in feet and inches (e.g. 5 11):");
        int hFeet = Integer.parseInt(in.next());
        int hInch = Integer.parseInt(in.nextLine().substring(1));

         
        System.out.print("Weight in pounds(e.g. 175):");
        double weight = Double.parseDouble(in.next());
        System.out.println();

        double bmi = (weight * lbsToKg) / Math.pow((((hFeet * feetToInches) + hInch) * inchesToMeters), 2);

        // print out the users height, weight, and BMI in appropriate units
        System.out.println("Body Mass Index Calculator");
        System.out.println("============================");
        System.out.println("Name: "+ firstName + " " + lastName);
        System.out.println("Height (m): " + (int)(10 * (((hFeet * feetToInches) + hInch) * inchesToMeters)) / 10.0);
        System.out.println("Weight (kg): " + (int)(10 * (weight * lbsToKg)) / 10.0);
        System.out.println("BMI: " + (int)(10 * bmi) / 10.0);

        //use logic to categorize the BMI then print out the decision
        String category;
        if (bmi < 18.5) {
            category = "Underweight";      
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Normal or Healthy Weight";      
        }
        else if (bmi >=25.0 && bmi <= 29.9) {
            category = "Overwieght";      
        }
        else {
            category = "Obese";      
        }
        System.out.println("Category: " + category);

    }
}
