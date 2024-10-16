package org.example.task5;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int yearOfProduction;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void start() {
        System.out.println("Let's go!");

    }

    @Override
    public void stop() {
        System.out.println("Stop!");

    }

    @Override
    public void drive(int distance) {
        System.out.println("The car passed by " + distance + " km");
    }
}
