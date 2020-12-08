package com.praveen.shethe.streamingapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Praveenkumar on 12/7/2020.
 */
public class JavaStreamApi {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(3);
        integerList.add(5);
        integerList.add(8);
        integerList.add(4);
        integerList.add(1);
        integerList.add(2);
        integerList.add(13);
        integerList.add(6);
        integerList.add(9);
        integerList.add(12);
        integerList.add(11);
        integerList.add(10);
//        System.out.println("Array list");
//        integerList.forEach(System.out::println);
        int a[] = {2,4,65,7,9,1,2,363,6};
//        int a[] = {};
        try{
            System.out.println(IntStream.of(a).min().getAsInt());
            System.out.println(IntStream.of(a).max().getAsInt());
            System.out.println(IntStream.of(a).max().getAsInt());
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
