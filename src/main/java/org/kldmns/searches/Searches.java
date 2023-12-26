package org.kldmns.searches;

public class Searches {
    public static void main(String[] args) {
        int[] arr = {10, 6, 2, 3, 1, 8};
        System.out.println("Linear " + linearSearch(arr, 3));
        System.out.println("Binary " + binarySearch(arr, 9));
    }

    private static boolean binarySearch(int[] arr, int key) {
        int l = 0;
        int r = arr.length - 1;
        bubbleSort(arr);

        while (l <= r){
            int mid = (l + r) / 2;
            if (arr[mid] == key)
                return true;

            if (arr[mid] < key)
                l = mid + 1;
            else r = mid - 1;
        }

        return false;
    }

    private static boolean linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) // O(n)
            if (arr[i] == key)
                return true;

        return false;
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 1; j < n - i; j++){
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
