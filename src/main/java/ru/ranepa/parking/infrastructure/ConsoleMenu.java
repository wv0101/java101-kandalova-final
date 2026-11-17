package ru.ranepa.parking.infrastructure;

import ru.ranepa.parking.application.ParkingPlaceService;
import ru.ranepa.parking.application.VehicleService;
import ru.ranepa.parking.application.ParkingSessionService;

import java.util.Scanner;

public class ConsoleMenu {

    private Scanner scanner;
    private ParkingPlaceService parkingPlaceService;
    private VehicleService vehicleService;
    private ParkingSessionService parkingSessionService;

    public ConsoleMenu(
            Scanner scanner,
            ParkingPlaceService parkingPlaceService,
            VehicleService vehicleService,
            ParkingSessionService parkingSessionService
    ) {
        this.scanner = scanner;
        this.parkingPlaceService = parkingPlaceService;
        this.vehicleService = vehicleService;
        this.parkingSessionService = parkingSessionService;
    }

    public void run() {
        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить парковочное место");
            System.out.println("2. Добавить транспорт");
            System.out.println("3. Показать все парковочные места и транспорт");
            System.out.println("4. Найти парковочное место по номеру");
            System.out.println("5. Зафиксировать въезд или выезд");
            System.out.println("6. Показать статистику");
            System.out.println("0. Выход");

            System.out.print("Ваш выбор: ");

            String command = scanner.nextLine();

            switch (command) {

                case "1":
                    parkingPlaceService.addParkingPlace();
                    System.out.println("Добавление места (TODO).");
                    break;

                case "2":
                    vehicleService.addVehicle();
                    System.out.println("Добавление транспорта (TODO).");
                    break;

                case "3":
                    parkingPlaceService.getAllParkingPlaces();
                    vehicleService.getAllVehicles();
                    System.out.println("Вывод списков (TODO).");
                    break;

                case "4":
                    System.out.print("Введите номер места: ");
                    String number = scanner.nextLine();

                    parkingPlaceService.findParkingPlace(number);
                    System.out.println("Поиск места (TODO).");
                    break;

                case "5":
                    System.out.println("1. Зафиксировать въезд");
                    System.out.println("2. Зафиксировать выезд");
                    System.out.print("Ваш выбор: ");

                    String operation = scanner.nextLine();

                    if (operation.equals("1")) {
                        parkingSessionService.startParkingSession();
                        System.out.println("Въезд (TODO).");
                    } else if (operation.equals("2")) {
                        parkingSessionService.finishParkingSession();
                        System.out.println("Выезд (TODO).");
                    } else {
                        System.out.println("Такой команды нет.");
                    }
                    break;

                case "6":
                    parkingSessionService.showStatistics();
                    System.out.println("Статистика (TODO).");
                    break;

                case "0":
                    running = false;
                    System.out.println("Работа системы завершена.");
                    break;

                default:
                    System.out.println("Неверная команда. Попробуйте ещё раз.");
                    break;
            }
        }
    }
}
