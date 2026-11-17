package ru.ranepa.parking.infrastructure;

import ru.ranepa.parking.application.port.ParkingSessionRepository;
import ru.ranepa.parking.domain.ParkingSession;
import java.util.ArrayList;
import java.util.List;

public class InMemoryParkingSessionRepository
        implements ParkingSessionRepository {

    private List<ParkingSession> parkingSessions = new ArrayList<>();

    @Override
    public void add(ParkingSession parkingSession) {
        // TODO: добавить сессию в список
    }

    @Override
    public List<ParkingSession> findAll() {
        // TODO: вернуть список сессий
        return null;
    }

    @Override
    public ParkingSession findByName(String name) {
        // TODO: найти сессию
        return null;
    }
}
