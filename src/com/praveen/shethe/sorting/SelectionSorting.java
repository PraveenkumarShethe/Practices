package com.praveen.shethe.sorting;

/**
 * Created by Praveenkumar on 11/4/2020.
 */
public class SelectionSorting {

    public static void main(String[] args) {
        int a[] = {64, 87, 67, 10, 20, 9};
        for (int i = 0 ; i < a.length ; i++ ){
            System.out.print(a[i]+ ",");
        }
        System.out.println();
        selectionSort(a);
        for (int i = 0 ; i < a.length ; i++ ){
            System.out.print(a[i]+ ",");
        }
    }

    public static void selectionSort(int arr[]){

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
