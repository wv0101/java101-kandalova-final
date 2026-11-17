package ru.ranepa.parking.application;

import ru.ranepa.parking.application.port.VehicleRepository;
import ru.ranepa.parking.domain.Vehicle;
import java.util.List;

public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void addVehicle() {
        // TODO: добавить транспорт
    }

    public List<Vehicle> getAllVehicles() {
        // TODO: вернуть весь транспорт
        return null;
    }

    public Vehicle findVehicle(String plateNumber) {
        // TODO: найти транспорт по государственному номеру
        return null;
    }
}