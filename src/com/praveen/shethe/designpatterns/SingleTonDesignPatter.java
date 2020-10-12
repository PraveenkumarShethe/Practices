package com.praveen.shethe.designpatterns;

/**
 * Created by Praveenkumar on 10/10/2020.
 */
public class SingleTonDesignPatter {

    private static SingleTonDesignPatter instance = new SingleTonDesignPatter();

    private SingleTonDesignPatter() {}

    public static SingleTonDesignPatter getSingleTonDesignPatter() {
        return instance;
    }
}