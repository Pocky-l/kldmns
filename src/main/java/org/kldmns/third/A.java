package org.kldmns.third;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String b = scanner.nextLine();
            String a = reconstructA(b);
            System.out.println(a);
        }
    }

    public static String reconstructA(String b) {
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < b.length() - 1; i += 2) {
            a.append(b.charAt(i));
        }

        a.append(b.charAt(b.length() - 1));

        return a.toString();
    }
}
