package org.kldmns.oib;

import java.util.Scanner;

public class VigenereDec {
    public static String decrypt(String ciphertext, String keyword) {
        StringBuilder decryptedText = new StringBuilder();
        int keywordLength = keyword.length();

        for (int i = 0; i < ciphertext.length(); i++) {
            char currentChar = ciphertext.charAt(i);

            if (Character.isLetter(currentChar)) {
                char base = Character.isUpperCase(currentChar) ? 'A' : 'a';
                int shift = keyword.charAt(i % keywordLength) - base;
                int shifted = (currentChar - base - shift + 26) % 26 + base; // Используем +26 для обработки отрицательных сдвигов
                decryptedText.append((char) shifted);
            } else {
                decryptedText.append(currentChar);
            }
        }

        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите зашифрованный текст: ");
        String ciphertext = scanner.nextLine();

        System.out.print("Введите ключевое слово: ");
        String keyword = scanner.nextLine();

        String decryptedText = decrypt(ciphertext, keyword);
        System.out.println("Расшифрованный текст: " + decryptedText);

        scanner.close();
    }
}

