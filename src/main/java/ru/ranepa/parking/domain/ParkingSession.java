package ru.ranepa.parking.domain;

public class ParkingSession {
    private Vehicle vehicle;
    private ParkingPlace parkingPlace;
    private String startTime;
    private String endTime;

    public ParkingSession(
            Vehicle vehicle,
            ParkingPlace parkingPlace,
            String startTime,
            String endTime
    ) {
        this.vehicle = vehicle;
        this.parkingPlace = parkingPlace;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
