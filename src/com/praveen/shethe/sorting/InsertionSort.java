package com.praveen.shethe.sorting;

/**
 * Created by Praveenkumar on 10/30/2020.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        System.out.println("Input provided");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ,");
        }
//        sort1(a);
        sort(a);
        System.out.println("printing sorted elements ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ,");
        }
    }

    public static void sort1(int[] a) {
        System.out.println();
        for (int k = 1; k < 10; k++) {
            int temp = a[k];
            int j = k - 1;
            while (j >= 0 && temp <= a[j]) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
