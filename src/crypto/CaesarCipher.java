package crypto;

import crypto.CryptoBase;

public class CaesarCipher extends CryptoBase {
    private String alphabet;
    private int shift;
    String DEFAULT_ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+-*/=(){}[]<>!@#$%^&*|\\;:'\",.?`~";


    public CaesarCipher(String alphabet, int shift) {
        this.alphabet = alphabet;
        this.shift = shift;
    }

    public CaesarCipher(int shift) {
        CaesarCipher(DEFAULT_ALPHABET, shift);
    }

    public String encrypt(String content) {
        String buffer = "";
        for (int i = 0; i < content.length(); i++) {
            int shifted = (alphabet.indexOf(content.charAt(i)) + shift) % alphabet.length();
            buffer += alphabet.charAt((shifted + alphabet.length()) % alphabet.length());
        }
        return buffer;
    }

    public String decrypt(String content) {
        String buffer = "";
        for (int i = 0; i < content.length(); i++) {
            int shifted = (alphabet.indexOf(content.charAt(i)) - shift) % alphabet.length();
            buffer += alphabet.charAt((shifted + alphabet.length()) % alphabet.length());
        }
        return buffer;
    }
}
