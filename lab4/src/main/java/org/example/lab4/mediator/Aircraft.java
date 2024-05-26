package org.example.lab4.mediator;

import lombok.Getter;
import lombok.Setter;

public class Aircraft {
    @Getter
    private final String name;
    @Setter
    private CommandCentre commandCentre;

    public Aircraft(String name) {
        this.name = name;
    }

    public void land() {
        commandCentre.requestLanding(this);
    }

    public void takeOff() {
        commandCentre.requestTakeOff(this);
    }
}
