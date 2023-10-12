package org.kldmns.third;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int maxState = Math.max(n, Math.max(n / 10, n / 100 * 10 + n % 10));

        System.out.println(maxState);
    }
}
