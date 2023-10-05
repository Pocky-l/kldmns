package org.kldmns.second;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] characters = input.toCharArray();
        boolean isAllLowerCase = true;

        for (int i = 1; i < characters.length; i++) {
            if (Character.isLowerCase(characters[i])) {
                isAllLowerCase = false;
            }
        }

        if (isAllLowerCase) {
            for (int i = 0; i < characters.length; i++) {
                if (Character.isUpperCase(characters[i])) {
                    characters[i] = Character.toLowerCase(characters[i]);
                } else {
                    characters[i] = Character.toUpperCase(characters[i]);
                }
            }
        }

        for (char value : characters) {
            System.out.print(value);
        }
    }
}
