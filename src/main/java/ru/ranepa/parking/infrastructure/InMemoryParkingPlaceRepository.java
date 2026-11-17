package ru.ranepa.parking.infrastructure;

import ru.ranepa.parking.application.port.ParkingPlaceRepository;
import ru.ranepa.parking.domain.ParkingPlace;
import java.util.ArrayList;
import java.util.List;

public class InMemoryParkingPlaceRepository
        implements ParkingPlaceRepository {

    private List<ParkingPlace> parkingPlaces = new ArrayList<>();

    @Override
    public void add(ParkingPlace parkingPlace) {
        // TODO: добавить место в список
    }

    @Override
    public List<ParkingPlace> findAll() {
        // TODO: вернуть список мест
        return null;
    }

    @Override
    public ParkingPlace findByName(String name) {
        // TODO: найти место по номеру
        return null;
    }
}
