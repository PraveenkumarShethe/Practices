package com.praveen.shethe.designpatterns;

/**
 * Created by Praveenkumar on 10/12/2020.
 */
public class TestingSingleTonPatter {

    public static void main(String[] args) {
        SingleTonDesignPatter singleTonDesignPatter = SingleTonDesignPatter.getSingleTonDesignPatter();
        SingleTonDesignPatter singleTonDesignPatter1 = SingleTonDesignPatter.getSingleTonDesignPatter();
        System.out.println(singleTonDesignPatter == singleTonDesignPatter1);
    }

}
