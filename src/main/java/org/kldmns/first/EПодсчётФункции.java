package org.kldmns.first;

import java.util.Scanner;

/**
 * Для положительного целого числа n определим функцию f:
 *
 * f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn
 *
 * Ваша задача — посчитать f(n) для данного целого числа n.
 *
 * Входные данные
 * В единственной строке записано положительное целое число n (1 ≤ n ≤ 1015).
 *
 * Выходные данные
 * Выведите f(n) в единственной строке.
 */
public class EПодсчётФункции {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result;

        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = n / 2 - n;
        }

        System.out.println(result);
    }
}
