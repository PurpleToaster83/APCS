/**
 * Purpose: to print out a student's information to the scree
 * 
 * @authors William Van Uitert
 * @version August 13, 2024
 */

public class StudentInfoCard {
    
    public static void main(String[] args) {

        String line = "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
        String fullGap = "*                                                                                                   *";

        // print out the header
        System.out.println();
        System.out.println(line);
        System.out.println(fullGap);
        System.out.println("*                                        Student Information                                        *");
        System.out.println(fullGap);
        System.out.println(line);
        System.out.println();

        // print out student's general information
        System.out.print(" Name: William");
        System.out.print("                            ");
        System.out.println("Birthday: March 18th, 2008");
        System.out.print(" Age: 16");
        System.out.print("                                  ");
        System.out.println("Grade: 11th");
        System.out.print(" School: Hollis Brookline High School");
        System.out.print("     ");
        System.out.println("City: Brookline, NH");

        // print out the students contact information
        System.out.println();
        System.out.print(" Cell Phone: 603-400-9932");
        System.out.print("                 ");
        System.out.println("Available: 4:30pm - 11:00 pm Thur-Sun");
        System.out.print(" Email: william.vanuitert@gmail.com,");
        System.out.print("      ");
        System.out.println("primary method of contact");

        // print out the parent's contact information
        System.out.println();
        System.out.println(" Father's Contact Info:");
        System.out.println("  • Cell Phone: 603-715-7373");
        System.out.println("  • Email: robert.vanuitert@gmail.com");

        // print out the student's math/coding experiance
        System.out.println();
        System.out.println(" Current Math Class: Honors Pre-Calculus");
        System.out.println(" Programming Experiance:\n    • Foundations of Programming (VLACS) - Python,\n    • Creative Coding Javascipt 1 (VLACS) - Javascript\n    • Hollis Brokline Robotics Team - Java and Python\n    • Introduction to Artificial Intelligence in Python (Harvard Secondary School) - Python");
        
        // print out the student's reason for taking APCS
        System.out.println();
        System.out.println(" I am taking AP Computer Science because I hope to learn more programming skills and strengthen\n my competancy in object-oriented programming. I feel this course will help me prepare for a\n possible career in the Computer Science or Software Development.");
        System.out.println();
    }
}