package org.kldmns.third;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Чтобы съесть перевод строки после числа t

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            if (isSquare(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isSquare(String s) {
        int n = s.length();
        if (n % 2 != 0) {
            return false; // Если длина нечетная, строка не может быть квадратной
        }

        String firstHalf = s.substring(0, n / 2);
        String secondHalf = s.substring(n / 2);

        return firstHalf.equals(secondHalf);
    }
}
