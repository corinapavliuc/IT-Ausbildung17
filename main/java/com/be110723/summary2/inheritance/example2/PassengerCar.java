package com.be110723.summary2.inheritance.example2;

public class PassengerCar extends Car{
    private Integer numberOfSeats;

    public PassengerCar(String model, String engine, Double price, String color, Integer numberOfSeats) {
        super(model, engine, price, color);
        this.numberOfSeats = numberOfSeats;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayCarInfo(){
        System.out.println("Passenger Car Model:" + getModel());
        System.out.println("Passenger Car Engine:" + getEngine());
        System.out.println("Passenger Car Price:" + getPrice());
        System.out.println("Passenger Car Color:" + getColor());
        System.out.println("Passenger Car Number Of Seats:" + getNumberOfSeats());

    }
}
