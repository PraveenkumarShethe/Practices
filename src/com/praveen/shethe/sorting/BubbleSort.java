package com.praveen.shethe.sorting;

/**
 * Created by Praveenkumar on 10/14/2020.
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void bubbleSort(int a[]){
        for (int i=0;i<a.length-1;i++) {
            for (int j=0;j<a.length-1;j++){
                if (a[i]>a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[j++]=temp;
                    System.out.print(","+temp);
                }
            }
        }
        System.out.println();
    }
}
