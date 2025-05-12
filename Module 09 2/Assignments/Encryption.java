/*
 * Purpose: to create a class to encode messages
 * 
 * @author William Van Uitert
 * @version 03/14/2025
 */

public class Encryption {

    public static char[] getAlphabet(int key) {
        char[] alphabet = CaesarTester.ALPHABET;
        char[] newAlphabet = new char[alphabet.length];

        for(int c = 0; c < alphabet.length; c++) {
            newAlphabet[c] = (char)(((alphabet[c] - 'a' + key) % alphabet.length) + 'a'); //TODO: fix logic
        }

        return newAlphabet;
    }

    public String encode(String message, int key) {
        String encodedMSg = "";
        char shiftedChar;

        for(int i = 0; i < message.length(); i++) {
            char nextChar = message.charAt(i);
            if((0 <= (nextChar + key)) && ('a' + 25 >= (nextChar + key))){
                shiftedChar = (char)(nextChar + (key));
                encodedMSg += shiftedChar;
            }
        }
        return encodedMSg;
    }
}