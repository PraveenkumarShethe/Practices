package com.praveen.shethe.streamingapi;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * Created by Praveenkumar on 12/9/2020.
 */
public class StreamApiExample {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 78, 1, 2, 3, 4, 2, 1, 25, 7, 8, 3, 0, 0};
        IntStream.of(a)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
        IntStream.of(a).min().ifPresent(System.out::println);

        IntSummaryStatistics intSummaryStatistics = IntStream.of(a).summaryStatistics();
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());;
        System.out.println(intSummaryStatistics.getSum());;
        System.out.println(intSummaryStatistics.getCount());;
        System.out.println(intSummaryStatistics.getAverage());;
    }

}
