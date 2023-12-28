package com.be110723.summary2.inheritance.example2;

import com.be110723.summary2.inheritance.example1.Dog;

public class Truck extends Car{

    private String producer;

    private Double cargo;

    public Truck(String model, String engine, Double price, String color, String producer, Double cargo) {
        super(model, engine, price, color);
        this.producer = producer;
        this.cargo = cargo;
    }

    public String getProducer() {
        return producer;
    }

    public Double getCargo() {
        return cargo;
    }

    @Override
    public void displayCarInfo(){
        System.out.println("Truck Car Model:" + getModel());
        System.out.println("Truck Car Engine:" + getEngine());
        System.out.println("Truck Car Price:" + getPrice());
        System.out.println("Truck Car Color:" + getColor());
        System.out.println("Truck Car Producer:" + getProducer());
        System.out.println("Truck Car Cargo:" + getCargo());

    }

}
