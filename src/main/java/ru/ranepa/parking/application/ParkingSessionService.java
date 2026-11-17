package ru.ranepa.parking.application;

import ru.ranepa.parking.application.port.ParkingSessionRepository;
import ru.ranepa.parking.domain.ParkingSession;
import java.util.List;

public class ParkingSessionService {

    private ParkingSessionRepository parkingSessionRepository;

    public ParkingSessionService(
            ParkingSessionRepository parkingSessionRepository
    ) {
        this.parkingSessionRepository = parkingSessionRepository;
    }

    public void startParkingSession() {
        // TODO: зафиксировать въезд транспорта
    }

    public void finishParkingSession() {
        // TODO: зафиксировать выезд транспорта
    }

    public List<ParkingSession> getAllParkingSessions() {
        // TODO: вернуть все сессии парковки
        return null;
    }

    public ParkingSession findParkingSession(String plateNumber) {
        // TODO: найти сессию по государственному номеру
        return null;
    }

    public void showStatistics() {
        // TODO: показать статистику парковки
    }
}
