package org.kldmns.third;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] weights = new int[n];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                weights[j] = scanner.nextInt();
                sum += weights[j];
            }

            if (sum % 2 == 0) {
                if (canSplitEqually(weights, 0, 0, sum / 2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

            if (i < t - 1) {
                scanner.nextLine();
            }
        }
    }

    public static boolean canSplitEqually(int[] weights, int index, int currentSum, int targetSum) {
        if (currentSum == targetSum) {
            return true;
        }
        if (index == weights.length) {
            return false;
        }
        if (canSplitEqually(weights, index + 1, currentSum + weights[index], targetSum)) {
            return true;
        }
        return canSplitEqually(weights, index + 1, currentSum, targetSum);
    }
}
