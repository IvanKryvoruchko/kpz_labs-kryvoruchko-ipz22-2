package org.example.lab4.mediator;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Runway runway1 = new Runway();
        Runway runway2 = new Runway();
        List<Runway> runways = List.of(runway1, runway2);

        Aircraft aircraft1 = new Aircraft("Aircraft1");
        Aircraft aircraft2 = new Aircraft("Aircraft2");
        List<Aircraft> aircrafts = List.of(aircraft1, aircraft2);

        CommandCentre commandCentre = new CommandCentre(runways, aircrafts);

        // Request landing and takeoff
        aircraft1.land();
        aircraft2.land();
        aircraft1.takeOff();
        aircraft2.takeOff();
    }
}
