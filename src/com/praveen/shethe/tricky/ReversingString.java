package com.praveen.shethe.tricky;

/**
 * Created by Praveenkumar on 11/14/2020.
 */
public class ReversingString {

    public boolean revString(String val){

        boolean result = false;
        String temp = "";
        for (int i = val.length()-1 ; i>=0 ; i-- ){
            temp = temp  + val.charAt(i);
        }
        if (temp.equals(val)){
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        ReversingString reversingString = new ReversingString();
        System.out.println(reversingString.revString("madam"));
    }
}
