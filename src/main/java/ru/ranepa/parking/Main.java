package ru.ranepa.parking;

import ru.ranepa.parking.application.ParkingPlaceService;
import ru.ranepa.parking.application.VehicleService;
import ru.ranepa.parking.application.ParkingSessionService;

import ru.ranepa.parking.application.port.ParkingPlaceRepository;
import ru.ranepa.parking.application.port.VehicleRepository;
import ru.ranepa.parking.application.port.ParkingSessionRepository;

import ru.ranepa.parking.infrastructure.ConsoleMenu;
import ru.ranepa.parking.infrastructure.InMemoryParkingPlaceRepository;
import ru.ranepa.parking.infrastructure.InMemoryVehicleRepository;
import ru.ranepa.parking.infrastructure.InMemoryParkingSessionRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParkingPlaceRepository parkingPlaceRepository =
                new InMemoryParkingPlaceRepository();

        VehicleRepository vehicleRepository =
                new InMemoryVehicleRepository();

        ParkingSessionRepository parkingSessionRepository =
                new InMemoryParkingSessionRepository();

        ParkingPlaceService parkingPlaceService =
                new ParkingPlaceService(parkingPlaceRepository);

        VehicleService vehicleService =
                new VehicleService(vehicleRepository);

        ParkingSessionService parkingSessionService =
                new ParkingSessionService(parkingSessionRepository);

        Scanner scanner = new Scanner(System.in);

        ConsoleMenu menu = new ConsoleMenu(
                scanner,
                parkingPlaceService,
                vehicleService,
                parkingSessionService
        );

        System.out.println("Система управления парковкой");

        menu.run();
    }
}