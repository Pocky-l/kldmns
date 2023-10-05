package org.kldmns.second;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int totalTime = 240 - k;
        int solvedTasks = 0;

        for (int i = 1; i <= n; i++) {
            int timeNeeded = 5 * i;
            if (totalTime >= timeNeeded) {
                totalTime -= timeNeeded;
                solvedTasks++;
            } else {
                break;
            }
        }

        System.out.println(solvedTasks);
    }
}
