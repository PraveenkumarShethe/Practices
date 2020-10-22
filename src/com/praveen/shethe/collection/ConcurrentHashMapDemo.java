package com.praveen.shethe.collection;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Praveenkumar on 10/22/2020.
 */
class ConcurrentHashMapDemo
{
    public static void main(String[] args)
    {
        ConcurrentHashMap m=new ConcurrentHashMap();
        m.put(100,"Hello");
        m.put(101,"Geeks");
        m.put(102,"Geeks");
//        m.put(null,"World");
        System.out.println(m);
    }
}