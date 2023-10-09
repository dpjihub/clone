package com.ohjiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car(); //속성

    public void startUp(){
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }
}
