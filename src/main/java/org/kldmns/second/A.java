package org.kldmns.second;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<Character> uniqueLetters = new HashSet<>();

        for (char letter : input.toCharArray()) {
            if (Character.isLetter(letter)) {
                uniqueLetters.add(letter);
            }
        }
        System.out.println(uniqueLetters.size());
    }
}
