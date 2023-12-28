package com.be110723.summary2.inheritance.fruits;

public class FruitDemo {
    public static void main(String[] args) {
        Apple apple = new Apple(new String[]{"A", "C", "D"},25.5, "green");
        Pineapple pineapple = new Pineapple(new String[]{"B12", "C", "E"},33.5, true);

        Fruit[] fruits = {apple, pineapple};

        for (int i = 0; i < fruits.length; i++) {
            fruits[i].displayInfo();
        }
    }
}
