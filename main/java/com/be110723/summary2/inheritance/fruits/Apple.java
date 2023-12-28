package com.be110723.summary2.inheritance.fruits;

import java.util.Arrays;

public class Apple extends Fruit {

    private String color;

    public Apple(String[] vitamins, Double sugar, String color) {
        super(vitamins, sugar);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Vitamins: " + Arrays.toString(getVitamins()));
        System.out.println("Sugar: " + getSugar());
        System.out.println("Color: " + getColor());
    }
}
