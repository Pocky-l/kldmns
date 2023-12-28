package org.kldmns.oib;

import java.util.Scanner;

public class Vigenere {
    public static String encrypt(String plaintext, String keyword) {
        StringBuilder encryptedText = new StringBuilder();
        int keywordLength = keyword.length();

        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                int shift = keyword.charAt(i % keywordLength) - base;
                int shifted = (currentChar - base + shift) % 26 + base;
                encryptedText.append((char) shifted);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String plaintext = scanner.nextLine();

        System.out.print("Введите ключевое слово: ");
        String keyword = scanner.nextLine();

        String encryptedText = encrypt(plaintext, keyword);
        System.out.println("Зашифрованный текст: " + encryptedText);

        scanner.close();
    }
}

