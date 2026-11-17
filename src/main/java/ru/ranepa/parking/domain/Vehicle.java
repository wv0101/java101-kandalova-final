package ru.ranepa.parking.domain;

public class Vehicle {
    private String plateNumber;
    private String brand;
    private String type;

    public Vehicle(String plateNumber, String brand, String type) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
}