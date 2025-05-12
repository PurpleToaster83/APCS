/*
 * Purpose: to decode or encode a message
 * 
 * @author William Van Uitert
 * @version 03/14/2025
 */

import java.util.Scanner;

public class CaesarTester {
    private static int key;
    public static final char[] ALPHABET = new char[26];

    public static void main(String[] args) {
        // fill out the alphabet array
        for(int i = 0; i < ALPHABET.length; i ++) {
            ALPHABET[i] = (char)('a' + i);
        }

        Encryption encoder = new Encryption();
        Decryption decoder = new Decryption();


        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Encryption or Decryption (or exit): ");
            String choice = in.nextLine();
            boolean encryption = false;

            if (choice.equals("exit")) {
                break;
            }

            if(choice.equals("encryption") || choice.equals("Encrpytion")) {
                encryption = true;
            }

            System.out.print("Key (0 - 25): ");
            key = Integer.parseInt(in.nextLine());

            if(0 >= key || 25 <= key) {
                System.out.println("Invalid Key");
                continue;
            }

            System.out.print("Message: ");
            String message = in.nextLine();

            if(encryption) {
                char[] alphabet = encoder.getAlphabet(key);
                
                for(int c = 0; c < alphabet.length; c++) {
                    System.out.println(ALPHABET[c] + " --> " + alphabet[c]);
                }
                System.out.println(encoder.encode(message, key));
            }
            else {
                char[] alphabet = decoder.getAlphabet(key);
                
                for(int c = 0; c < alphabet.length; c++) {
                    System.out.println(ALPHABET[c] + " --> " + alphabet[c]);
                }
                System.out.println(decoder.decode(message, -1 * key));
            }

        }
    }
}
