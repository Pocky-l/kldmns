package org.kldmns.third;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int digit = x % 10;
            int sum = (digit - 1) * 10;

            int count = 1;
            while (x > 0) {
                sum += count;
                x /= 10;
                count++;
            }

            System.out.println(sum);
        }
    }
}
