package ru.ranepa.parking.infrastructure;

import ru.ranepa.parking.application.port.VehicleRepository;
import ru.ranepa.parking.domain.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class InMemoryVehicleRepository implements VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public void add(Vehicle vehicle) {
        // TODO: добавить транспорт в список
    }

    @Override
    public List<Vehicle> findAll() {
        // TODO: вернуть список транспорта
        return null;
    }

    @Override
    public Vehicle findByName(String name) {
        // TODO: найти транспорт по госномеру
        return null;
    }
}
