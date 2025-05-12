/*
 * Purpose: to ask for user input for a shopping order
 * 
 * @author: William Van Uitert
 * @version 8/26/24
 */

 
import java.util.Scanner;
import java.util.Math;

public class StockPurchasing {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // ask for the user's first and last names and save as strings
        System.out.println("Good Evening");
        System.out.print("Please enter your first and last name: ");
        String firstName = in.next();
        String lastName = in.nextLine();

        // ask for the current date
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.next();

        // if the entered date is not a real date or does not follow the format, ask again
        while (true) {
            try {
                if (
                    date.charAt(2) == '/' &&
                    date.charAt(5) == '/' &&
                    Integer.parseInt(date.substring(0, 2)) <= 12 &&
                    Integer.parseInt(date.substring(3, 5)) <= 31 &&
                    (date.substring(6)).length() == 4  
                ) {
                    break;
                }
                System.out.print("Enter today's date in the format (mm/dd/yyyy): ");
                date = in.next();
            }
            catch (Exception StringIndexOutOfBoundsException ) {
                System.out.print("Enter today's date in the format (mm/dd/yyyy): ");
                date = in.next();
            }
        }

        // ask the user for the ticker of the company they would like to buy from
        System.out.print("What is the ticker name you would like to buy? ");
        String ticker = in.next();

        // ask the user how many shares they would like to buy
        System.out.print("How many shares would you like to buy? ");
        String shareNum = in.next();

        // if the entered number is not a valid number, ask again
        while (true) {
            try {
                if (Double.parseDouble(shareNum) >= 0) {
                break;
                }
                System.out.print("How many shares would you like to buy? ");
                shareNum = in.next();
            }
            catch (Exception NumberFormatException) {
                System.out.print("How many shares would you like to buy? ");
                shareNum = in.next();
            }
        }

        // ask user for the current stock share price
        System.out.print("What is the current share price (omit dollar sign)? ");
        String price = in.next();

        // if the share price is not a  number, ask again
        while (true) {
            try {
                if (Double.parseDouble(price) >= 0) {
                    break;
                }
                System.out.print("What is the current share price (omit dollar sign)? ");
                price = in.next();
            }
            catch (Exception NumberFormatException){
                System.out.print("What is the current share price (omit dollar sign)? ");
                price = in.next();
            }
        }

        //ask the user for their debit card number
        System.out.print("Enter your debit card number (#####-###-####): ");
        String debitNumber = in.next();

        // if the input is not numeric or not in the proper format, ask again
        while (true) {
            try {
                if (
                    debitNumber.charAt(5) == '-' &&
                    debitNumber.charAt(9) == '-' &&
                    Integer.parseInt(debitNumber.substring(0, 5)) >= 0 &&
                    Integer.parseInt(debitNumber.substring(6, 9)) >= 0 &&
                    Integer.parseInt(debitNumber.substring(10)) >= 0 &&
                    debitNumber.length() == 14

                ) {
                    break;
                }
                System.out.print("Enter your debit card number (#####-###-####): ");
                debitNumber = in.next();
            }
            catch (Exception StringIndexOutOfBoundsException) {
                System.out.print("Enter your debit card number (#####-###-####): ");
                debitNumber = in.next();
            }
        }

        //ask the user to enter their pin   
        System.out.print("Enter your PIN (#####): ");
        String pin = in.next();

        // if the pin is not numeric or the right length, ask again
        while (true) {
            try {
                if (pin.length() == 5 && Integer.parseInt(pin) >= 0) {
                    break;
                }
                System.out.print("Enter your PIN (#####): ");
                pin = in.next();
            }
            catch (Exception NumberFormatException) {
                System.out.print("Enter your PIN (#####): ");
                pin = in.next();
            }
        }

        // print out a divider pattern
        for (int i = 0; i < 224; i++) {
            System.out.print("*_");
        }
        System.out.println("*");
        System.out.println("Your e-Receipt");
        System.out.println();

        // print out the order information
        System.out.println(Integer.parseInt(date.substring(0, 2)) + "-" + Integer.parseInt(date.substring(3, 5)) + "-" + Integer.parseInt(date.substring(6)));
        System.out.println("Order Number: " + (char)((Math.random() * 61) + 61) + (char)((Math.random() * 61) + 61) + 0 + (int)(Math.random() * 100));
        System.out.println();
        System.out.println("\t" + firstName.substring(0, 1) + ". " + lastName);
        System.out.println("\tAccount: #####-###-" + debitNumber.substring(10));
        System.out.println("\tTicker Name: " + ticker);
        System.out.println("\tNumber of Shares: " + shareNum);
        System.out.println("\tShare Price: $" + price);
        System.out.println();
        
        // calculate and print out the order amount
        Double totalAmount = Double.parseDouble(shareNum) * Double.parseDouble(price);
        System.out.println("\t$" + totalAmount + " will be debited to your account");
        System.out.println();

        System.out.println("\tThank you.");

        // print out a divider pattern
        for (int i = 0; i < 224; i++) {
            System.out.print("*_");
        }
        System.out.println("*\n");
    }
}
