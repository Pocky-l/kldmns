package org.kldmns.recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Нахождение факториала:");
        System.out.println("Факториал 5 = " + factorial(5));

        System.out.println("Фиббоначи:");
        System.out.println("Фиббоначи 5 = " + fibonachi(5));

        System.out.println("Вывод чисел по последовательности:");
        sequenceNumbers(5);

        System.out.println("Найти степень числа:");
        System.out.println("5^5 = " + exponentOfNumber(5, 5));

        System.out.println("Сумма между двух чисел:");
        System.out.println("между 5 и 10 = " + sumBetween(5, 10));

        System.out.println("Сумма всех чисел до определенного:");
        System.out.println("Сумма до 5 = " + sumBefore(5));

        System.out.println("Бинарный поиск:");
        System.out.println("Поиск числа 5. Index = " + binarySearch(new int[]{1, 2, 3, 4, 5, 6} , 5));
    }

    public static int factorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonachi(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    public static void sequenceNumbers(int n) {
        if (n > 0) {
            sequenceNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static int exponentOfNumber(int n, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return n * exponentOfNumber(n, exponent - 1);
        }
    }

    public static int sumBetween(int from, int before) {
        if (from == before) {
            return from;
        } else if (from < before) {
            return from + sumBetween(from + 1, before);
        } else {
            return before + sumBetween(before + 1, from);
        }
    }

    public static int sumBefore(int before) {
        if (before <= 0) {
            return before;
        } else {
            return before + sumBefore(before - 1);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; 
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right); 
        } else {
            return binarySearch(arr, target, left, mid - 1); 
        }
    }
}
