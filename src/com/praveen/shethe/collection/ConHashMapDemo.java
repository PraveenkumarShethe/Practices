package com.praveen.shethe.collection;

import java.util.HashMap;

/**
 * Created by Praveenkumar on 10/22/2020.
 */
class ConHashMapDemo
{
    public static void main(String[] args)
    {
        HashMap m=new HashMap();
        m.put(100,"Hello");
        m.put(101,"Geeks");
        m.put(102,"Geeks");
        m.put(102,"New Geeks");
        m.put(null,"World");
        System.out.println(m);
    }
}