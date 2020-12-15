package com.praveen.shethe.sorting;

/**
 * Created by Praveenkumar on 10/14/2020.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        System.out.println(" Input Values " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ,");
        }
        bubbleSorting(a);
        bubbleSortingImporvementOnforLoop(a);
        bubbleSortingImporvementOnforLoopAndSwapingValues(a);
    }

    public static void bubbleSorting(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Output Printing Sorted List ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ,");
        }
    }

    public static void bubbleSortingImporvementOnforLoop(int[] a) {

        for (int i = 0, j =0 ; j < a.length && i < a.length; i++, j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
            }
        }
        System.out.println();
        System.out.println("Output of bubbleSortingImporvementOnforLoop() Printing Sorted List ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ,");
        }
    }

    public static void bubbleSortingImporvementOnforLoopAndSwapingValues(int[] a) {

        for (int i = 0, j =0 ; j < a.length && i < a.length; i++, j++) {
            if (a[i] < a[j]) {
                a[i] = a[i] + a[j];
                a[j] = a[i] - a[j];
                a[i] = a[i] - a[j];
            }
        }
        System.out.println();
        System.out.println("Output of bubbleSortingImporvementOnforLoopAndSwapingValues() Printing Sorted List ...");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ,");
        }
    }
}