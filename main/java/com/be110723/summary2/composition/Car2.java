package com.be110723.summary2.composition;

public class Car2 {
    // композиция: объект класса Car полностью управляет объектом CarBody

    private CarBody carBody;

    public Car2(CarBody carBody) {
        this.carBody = carBody;
    }
}
