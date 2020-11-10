package com.praveen.shethe.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Praveenkumar on 11/10/2020.
 */
public class StremingDemo {

    public static void main(String[] args) {

        // Creating the streaming
        List<Integer> seqnumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int i = 0; i < seqnumber.size(); i++) {
            System.out.print(seqnumber.get(i) + " ,");
        }
        System.out.println();

        // Demostration of map method
        List<Integer> squre = seqnumber.stream().map(x -> x * x).collect(Collectors.toList());
        for (int i = 0; i < squre.size(); i++) {
            System.out.print(squre.get(i) + " ,");
        }

        // create a list of String
        List<String> names =
                Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
    }
}
