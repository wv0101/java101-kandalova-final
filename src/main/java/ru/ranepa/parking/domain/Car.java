package ru.ranepa.parking.domain;

public class Car extends Vehicle {
    private int occupiedPlaces;

    public Car(String plateNumber, String brand, int occupiedPlaces) {
        super(plateNumber, brand, "Легковой");
        this.occupiedPlaces = occupiedPlaces;
    }

    public int getOccupiedPlaces() {
        return occupiedPlaces;
    }
}