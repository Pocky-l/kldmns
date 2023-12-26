package org.kldmns.sort;

public class Bubble {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Бастапқы массив:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nСортталған массив:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        // Проходим по всем элементам массива
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
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
