package com.be110723.summary2.inheritance.fruits;

import java.util.Arrays;

public class Pineapple extends Fruit {

    private boolean isSweet;

    public Pineapple(String[] vitamins, Double sugar, boolean isSweet) {
        super(vitamins, sugar);
        this.isSweet = isSweet;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vitamins: " + Arrays.toString(getVitamins()));
        System.out.println("Sugar: " + getSugar());
        System.out.println("Is sweet? : " + isSweet());
    }
}
