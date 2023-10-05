package org.kldmns.second;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int oddCount = 0;
        int evenCount = 0;
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
                evenIndex = i + 1;
            } else {
                oddCount++;
                oddIndex = i + 1;
            }

            if (evenCount > 1 && oddCount == 1) {
                System.out.println(oddIndex);
                break;
            } else if (oddCount > 1 && evenCount == 1) {
                System.out.println(evenIndex);
                break;
            }
        }
    }
}
