package org.kldmns.oib;

import java.util.Scanner;

public class Ceaser {
        public static String encrypt(String plaintext, int shift) {
            StringBuilder encryptedText = new StringBuilder();

            for (int i = 0; i < plaintext.length(); i++) {
                char currentChar = plaintext.charAt(i);

                if (Character.isLetter(currentChar)) {
                    char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                    int shifted = (currentChar - base + shift) % 26 + base;
                    encryptedText.append((char) shifted);
                } else {
                    encryptedText.append(currentChar);
                }
            }

            return encryptedText.toString();
        }


        public static void main(String[] args) {
            String originalText = "Hello, World!";
            int shift = 3;

            String encryptedText = encrypt(originalText, shift);
            System.out.println("Encrypted: " + encryptedText);

        }
    }


