package com.be110723.summary2.composition;

public class Car {
    // композиция: объект класса Car полностью управляет объектом CarBody

    private CarBody carBody;

    public Car(String carType) {
        this.carBody = new CarBody(carType);
    }

    // при создании экземпляра класса Car мы создаем экземпляр класса CarBody

}
