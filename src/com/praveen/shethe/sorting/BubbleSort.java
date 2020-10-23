package com.praveen.shethe.sorting;

/**
 * Created by Praveenkumar on 10/14/2020.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        System.out.println(" Input Values ");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+ " ,");
        }
        for(int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Output Printing Sorted List ...");
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+ " ,");
        }
    }
}
