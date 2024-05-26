package org.example.lab4.mediator;

import java.util.UUID;
import lombok.Getter;

public class Runway {
    @Getter
    private final UUID id = UUID.randomUUID();
    private boolean isBusyWithAircraft = false;

    public void highlightRed() {
        System.out.println("Runway " + id + " is busy!");
    }

    public void highlightGreen() {
        System.out.println("Runway " + id + " is free!");
    }

    public boolean isBusyWithAircraft() {
        return isBusyWithAircraft;
    }

    public void setBusyWithAircraft(boolean busyWithAircraft) {
        isBusyWithAircraft = busyWithAircraft;
    }

}
