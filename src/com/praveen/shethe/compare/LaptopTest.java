package com.praveen.shethe.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Praveenkumar on 11/2/2020.
 */
public class LaptopTest {

    public static void main(String[] args) {

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Sony",2, 256));
        laptopList.add(new Laptop("Ooppo",392000, 1024));
        laptopList.add(new Laptop("toshiba",0, 128));
        laptopList.add(new Laptop("Apple",2378889, 2048));
        laptopList.add(new Laptop("Samsung",12000, 512));
        Collections.sort(laptopList);
        laptopList.forEach(laptop -> {
            System.out.println("Name : "+laptop.getLaptopName()+", Price: "+ laptop.getLaptopPrice()+", RAM: "+laptop.getRamSize());
        });
    }

}
