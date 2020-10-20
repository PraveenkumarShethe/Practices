package com.praveen.shethe.stringoperations;

/**
 * Created by Praveenkumar on 10/20/2020.
 */
public class StringImmutablity {

    public static void main(String[] args) {
        String s = "Praveenkumar";
        String s1 = "Praveenkumar";
        String s2 = new String("Praveenkumar");
        System.out.println("===================> ");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("===================> ");
        System.out.println(s1.equals(s2));
        System.out.println(s.equals(s1));
        System.out.println(s2.equals(s1));
        System.out.println("===================> ");
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s1 == s2);
        System.out.println(s2 == s);

        String concatation = "Praveenkumar";
        String concatation1 = " Shethe";
        String concateResult = concatation + concatation1;
        System.out.println(concateResult);
        System.out.println("-------------------------------------");
        String concateResult1 = concatation.concat(concatation1);
        System.out.println(concateResult1);
        System.out.println("-------------------------------------");

        System.out.println("Praveenkumar".substring(0,4)+ "i");
        System.out.println(concatation.toUpperCase());
        System.out.println(concatation.toLowerCase());


    }

}
