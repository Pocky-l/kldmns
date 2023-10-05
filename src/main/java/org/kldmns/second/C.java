package org.kldmns.second;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] denominations = {100, 20, 10, 5, 1};
        int count = 0;

        for (int i = 0; i < denominations.length; i++) {
            int currentDenomination = denominations[i];
            while (n >= currentDenomination) {
                n -= currentDenomination;
                count++;
            }
        }

        System.out.println(count);
    }
}
