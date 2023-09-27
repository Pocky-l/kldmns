package org.kldmns;

import java.util.Scanner;

public class AЮраИЗаселение {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Всего в общежитии комнат
        int count = 0;

        for (int i = 0; i < n; i++) {
            int pi = scanner.nextInt(); // Живут людей
            int qi = scanner.nextInt(); // Максимум может жить

            if (qi - pi >= 2) {
                count++;
            }
        }

        System.out.println(count); // Кол-во комнат, в скольких могут поселиться
    }
}