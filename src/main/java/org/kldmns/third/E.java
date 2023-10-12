package org.kldmns.third;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int[] numbers = new int[3];
            for (int j = 0; j < 3; j++) {
                numbers[j] = scanner.nextInt();
            }

            Arrays.sort(numbers);

            System.out.println(numbers[1]);
        }
    }
}
