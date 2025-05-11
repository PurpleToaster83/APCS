/*
 * Purpose: to determine the number of prime numbers between two bounds
 * 
 * @author William Van Uitert
 * @version 03/16/2025
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Cryptography {
    private static int upperBound;
    private static int lowerBound;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get the upper and lower bounds from the user
        System.out.print("Upper Bound: ");
        upperBound = Integer.parseInt(in.nextLine());
        System.out.print("Lower Bound: ");
        lowerBound = Integer.parseInt(in.nextLine());

        // keep track of primes and marked non-primes
        ArrayList<Integer> removed = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();

        // iterate all numbers between bounds
        for(int i = lowerBound; i <= upperBound; i++) {
            primes.add(i);
            
            // iterate over numbers below the possible prime
            for(int j = 2; j < i; j++) {

                // check to see if already in removed list
                if(removed.contains(i)) {
                    continue;
                }

                // if number is multiple of number remove from primes and mark as non-prime
                if(i % j == 0) {
                    primes.remove(i - removed.size());
                    removed.add(i);
                }
            }
        }

        System.out.printf("%d Primes Between %d and %d:\n", primes.size(), upperBound, upperBound);
        for(int p : primes) {
            System.out.println(p);
        }
    }

}
