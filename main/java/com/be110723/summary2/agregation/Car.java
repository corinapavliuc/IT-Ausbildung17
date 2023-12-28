package com.be110723.summary2.agregation;

public class Car {
    // Агрегация: объект класса Car содержит ссылку на объект класса Engine

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
