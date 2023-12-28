package org.kldmns.oib;

import java.util.Scanner;

public class CeaserDec {
    public static String decrypt(String ciphertext, int shift) {
        return encrypt(ciphertext, 26 - shift);
    }

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите зашифрованный текст: ");
        String encryptedText = scanner.nextLine();

        System.out.print("Введите сдвиг: ");
        int shift = scanner.nextInt();

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Расшифрованный текст: " + decryptedText);

        scanner.close();
    }
}
