package ru.ranepa.parking.application.port;

import ru.ranepa.parking.domain.Vehicle;
import java.util.List;

public interface VehicleRepository {

    void add(Vehicle vehicle);

    List<Vehicle> findAll();

    Vehicle findByName(String name);
}
