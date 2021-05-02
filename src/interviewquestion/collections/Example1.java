package interviewquestion.collections;

import java.util.TreeMap;

/**
 * Created by Praveenkumar on 5/2/2021.
 */
public class Example1 {

    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();

        treeMap.put(1 , "Hello");
        treeMap.put(1 , "Hi");
        treeMap.put(1 , "Hello");
        treeMap.put(2 , "Hello Pal");
        treeMap.put(3 , "Hi Pal");
        treeMap.put(4 , "Hello Mustpa");
        treeMap.put(5 , "Hi Mustpa");
        treeMap.put(6 , "Hello Dude");
        treeMap.put(7 , "Hi Dude");
        treeMap.put(null, null);

        System.out.println(treeMap);
    }
}
