package org.kldmns.third;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            if ("codeforces".contains(sc.nextLine())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
