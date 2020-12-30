package com.praveen.shethe.duplicate;

import java.util.HashSet;

/**
 * Created by Praveenkumar on 12/30/2020.
 */
public class RemoveDuplicate {

    public static void main(String[] args) {
        int arr[] = {3,2,2,1,2,2,1,9,8,7,6,7};
        removeDuplicate(arr).forEach(System.out::println);

    }

    public static HashSet<Integer> removeDuplicate(int[] arr){

        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i=0; i <= arr.length-1; i++){
            integerHashSet.add(arr[i]);
        }
        return integerHashSet;
    }
}
