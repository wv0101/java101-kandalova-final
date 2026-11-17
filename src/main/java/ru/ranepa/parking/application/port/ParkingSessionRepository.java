package ru.ranepa.parking.application.port;

import ru.ranepa.parking.domain.ParkingSession;
import java.util.List;

public interface ParkingSessionRepository {

    void add(ParkingSession parkingSession);

    List<ParkingSession> findAll();

    ParkingSession findByName(String name);
}
