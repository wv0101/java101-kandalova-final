package ru.ranepa.parking.application;

import ru.ranepa.parking.application.port.ParkingPlaceRepository;
import ru.ranepa.parking.domain.ParkingPlace;
import java.util.List;

public class ParkingPlaceService {

    private ParkingPlaceRepository parkingPlaceRepository;

    public ParkingPlaceService(ParkingPlaceRepository parkingPlaceRepository) {
        this.parkingPlaceRepository = parkingPlaceRepository;
    }

    public void addParkingPlace() {
        // TODO: добавить парковочное место
    }

    public List<ParkingPlace> getAllParkingPlaces() {
        // TODO: вернуть все парковочные места
        return null;
    }

    public ParkingPlace findParkingPlace(String number) {
        // TODO: найти парковочное место по номеру
        return null;
    }
}