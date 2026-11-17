package ru.ranepa.parking.domain;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String plateNumber, String brand, int loadCapacity) {
        super(plateNumber, brand, "Грузовой");
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
