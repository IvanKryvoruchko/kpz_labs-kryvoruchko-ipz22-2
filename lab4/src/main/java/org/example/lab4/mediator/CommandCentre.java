package org.example.lab4.mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandCentre {
    private final List<Runway> runways;
    private final List<Aircraft> aircrafts;
    private final Map<Runway, Aircraft> busyRunways = new HashMap<>();

    public CommandCentre(List<Runway> runways, List<Aircraft> aircrafts) {
        this.runways = runways;
        this.aircrafts = aircrafts;
        for (Aircraft aircraft : aircrafts) {
            aircraft.setCommandCentre(this);
        }
    }

    public void requestLanding(Aircraft aircraft) {
        for (Runway runway : runways) {
            if (!busyRunways.containsKey(runway)) {
                System.out.println("Aircraft " + aircraft.getName() + " is landing on runway " + runway.getId() + ".");
                busyRunways.put(runway, aircraft);
                runway.highlightRed();
                System.out.println("Aircraft " + aircraft.getName() + " has landed.");
                return;
            }
        }
        System.out.println("Could not land, all runways are busy");
    }

    public void requestTakeOff(Aircraft aircraft) {
        for (Runway runway : runways) {
            if (busyRunways.containsKey(runway) && busyRunways.get(runway) == aircraft) {
                System.out.println("Aircraft " + aircraft.getName() + " is taking off from runway " + runway.getId() + ".");
                runway.highlightGreen();
                busyRunways.remove(runway);
                System.out.println("Aircraft " + aircraft.getName() + " has taken off.");
                return;
            }
        }
        System.out.println("Could not take off, aircraft " + aircraft.getName() + " is not on any runway.");
    }
}
