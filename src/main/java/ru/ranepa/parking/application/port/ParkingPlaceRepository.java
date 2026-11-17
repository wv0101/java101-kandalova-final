package ru.ranepa.parking.application.port;

import ru.ranepa.parking.domain.ParkingPlace;
import java.util.List;

public interface ParkingPlaceRepository {

    void add(ParkingPlace parkingPlace);

    List<ParkingPlace> findAll();

    ParkingPlace findByName(String name);
}
