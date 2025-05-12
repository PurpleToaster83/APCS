/*
 * Purpose: to calculate a persons TDEE based on thier activity level during a day
 * 
 * @author William Van Uitert
 * @version 09/17/2024
 */

 import java.util.Scanner;

public class TDEE
{
    public static void main(String[] args)
    {   
        Scanner  in = new Scanner(System.in);

        System.out.println("Please Enter the Following Information");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Gender (M/F): ");
        String gender = in.next();
        System.out.print("BMR: ");
        String bmr = in.next();
        System.out.println();

        System.out.println("Select an Activcity Level");
        System.out.println("[A] Restubg (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Lihgt Manuel Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sport, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();

        System.out.print("Enter the letter corresponding to your activity level: ");

        String activity = in.next();
        double acitvityFactor = 0;

        if ("M".equals(gender) || "m".equals(gender)) {
            if ("A".equals(activity) || "a".equals(activity)) {
                acitvityFactor = 1.0;
            }
            else if ("B".equals(activity) || "b".equals(activity)) {
                acitvityFactor = 1.3;
            }
            else if ("C".equals(activity) || "c".equals(activity)) {
                acitvityFactor = 1.6;
            }
            else if ("D".equals(activity) || "d".equals(activity)) {
                acitvityFactor = 1.7;
            }
            else if ("E".equals(activity) || "e".equals(activity)) {
                acitvityFactor = 2.1;
            }
            else if ("F".equals(activity) || "f".equals(activity)) {
                acitvityFactor = 2.4;
            }
            else {
                System.out.println("You did not enter one of the choices!");
            }
        }
        else if ("F".equals(gender) || "f".equals(gender)) {
            if ("A".equals(activity) || "a".equals(activity)) {
                acitvityFactor = 1.0;
            }
            else if ("B".equals(activity) || "b".equals(activity)) {
                acitvityFactor = 1.3;
            }
            else if ("C".equals(activity) || "c".equals(activity)) {
                acitvityFactor = 1.5;
            }
            else if ("D".equals(activity) || "d".equals(activity)) {
                acitvityFactor = 1.6;
            }
            else if ("E".equals(activity) || "e".equals(activity)) {
                acitvityFactor = 1.9;
            }
            else if ("F".equals(activity) || "f".equals(activity)) {
                acitvityFactor = 2.2;
            }
            else {
                System.out.println("You did not enter one of the choices!");
            }
        }

        double tdee = Integer.parseInt(bmr) * acitvityFactor;
        
        System.out.println("Your results:");
        System.out.print("Name: " + name);
        System.out.println("\t\t Gender: " + gender);
        System.out.print("BMR: " + bmr);
        System.out.println("Activity Factor: " + acitvityFactor);
        System.out.println("TDEE: " + tdee + " calories");
    }
}
