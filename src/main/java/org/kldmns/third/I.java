package org.kldmns.third;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                String current = scan.next();
                if (current.charAt(0) == 'C' || current.charAt(0) == 'M'
                        || current.charAt(0) == 'Y') {
                    System.out.println("#Color");
                    System.exit(0);
                }
            }
        }
        System.out.println("#Black&White");
    }
}
