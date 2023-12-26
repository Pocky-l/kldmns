package org.kldmns.sort;

public class Vyborka {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Бастапқы массив:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nСортталған массив:");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}