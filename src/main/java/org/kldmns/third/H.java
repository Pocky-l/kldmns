package org.kldmns.third;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 1) {
            n /= 2;
            n--;
            System.out.println(n + 1);
            System.out.print(3 + " ");
        } else {
            n /= 2;
            System.out.println(n);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(2 + " ");
        }
        System.out.println();
    }
}
