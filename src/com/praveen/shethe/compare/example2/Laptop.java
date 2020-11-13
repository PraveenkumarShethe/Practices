package com.praveen.shethe.compare.example2;

/**
 * Created by Praveenkumar on 11/1/2020.
 */
public class Laptop implements Comparable<Laptop>{

    private String laptopName;

    private int laptopPrice;

    private int ramSize;

    Laptop(String laptopName, int laptopPrice, int ramSize){
        super();
        this.laptopName = laptopName;
        this.laptopPrice = laptopPrice;
        this.ramSize = ramSize;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public int compareTo(Laptop laptop) {
        if (this.getLaptopPrice() < laptop.getLaptopPrice()){
            return 1;
        }else{
            return -1;
        }
    }
}
