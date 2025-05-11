/*
 * Purpose: to create a class to decode messages
 * 
 * @author William Van Uitert
 * @version 03/14/2025
 */

public class Decryption {
    public static char[] getAlphabet(int key) {
        char[] alphabet = CaesarTester.ALPHABET;
        char[] newAlphabet = new char[alphabet.length];

        for(int c = 0; c < alphabet.length; c++) {
            newAlphabet[c] = (char)(((alphabet[c] - 'z' - key) % alphabet.length) +'z'); //TODO: fix logic
        }

        return newAlphabet;
    }

    public String decode(String message, int key ) {
        String encodedMsg = "";
        char shiftedChar;

        for(int i = 0; i < message.length(); i++) {
            char nextChar = message.charAt(i);
            if((0 <= (nextChar + key)) && ('a' + 25 >= (nextChar + key))){
                shiftedChar = (char)(nextChar + (key));
                encodedMsg += shiftedChar;
            }
        }
        return encodedMsg;
    }
}
