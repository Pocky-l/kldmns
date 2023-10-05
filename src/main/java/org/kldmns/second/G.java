package org.kldmns.second;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int amazingPerformances = 0;
        int minScore = scores[0];
        int maxScore = scores[0];

        for (int i = 1; i < n; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
                amazingPerformances++;
            } else if (scores[i] > maxScore) {
                maxScore = scores[i];
                amazingPerformances++;
            }
        }

        System.out.println(amazingPerformances);
    }
}
