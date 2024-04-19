package com.cydeo;

public class Car {
    int id;
    String make;

    public Car(int id, String make) {
        this.id = id;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                '}';
    }
}
