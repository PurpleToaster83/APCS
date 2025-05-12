/**
 * This class demonstrates the use of several members of the Math class.
 *Purpose: to calculate the hypotenuse of a triangle given its sides
 *
 * @author William Van Uitert
 * @version 08/19/2024
 */

 public class PyTheorem
 {
     public static void main(String[ ] args)
     {

        //method one
        //initialize variables
        int sideA = (int)(18 * Math.random()) + 5;
        int sideB = (int)(18 * Math.random()) + 5;
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)); // method 1: use method Pythagorean Theorem

        // print triangle 1 info
        System.out.print("Triangle 1");
        System.out.print("\t\tSide 1: " + sideA);
        System.out.print("\t\tSide 2: " + sideB);
        System.out.println("\t\tHypotenuse: " + hypotenuse);

        // assign variables to new values
        sideA = (int)(18 * Math.random()) + 5;
        sideB = (int)(18 * Math.random()) + 5;
        hypotenuse = Math.hypot(sideA, sideB); // method 2: use method from Math lib

        // print triangle 2 info
        System.out.print("Triangle 2");
        System.out.print("\t\tSide 1 :" + sideA);
        System.out.print("\t\tSide 2: " + sideB);
        System.out.println("\t\tHypotenuse: " + hypotenuse);

     }//end of main method
 }//end of class