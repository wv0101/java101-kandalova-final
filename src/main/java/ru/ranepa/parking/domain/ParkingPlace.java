package ru.ranepa.parking.domain;

public class ParkingPlace {
    private String number;
    private String size;
    private String status;

    public ParkingPlace(String number, String size, String status) {
        this.number = number;
        this.size = size;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public String getSize() {
        return size;
    }

    public String getStatus() {
        return status;
    }
}