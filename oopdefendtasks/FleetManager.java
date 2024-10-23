package oopdefendtasks;

import java.util.ArrayList;
import java.util.List;

public class FleetManager {
    private List<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
        System.out.println("Vehicle added: " + vehicle);
    }

    public void saveFleet() {
        FileManager.saveVehicles(fleet);
        System.out.println("Fleet saved successfully.");
    }

    public void loadFleet() {
        fleet = FileManager.loadVehicles();
        System.out.println("Fleet loaded successfully.");
    }

    public void displayFleet() {
        if (fleet.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
        } else {
            for (Vehicle vehicle : fleet) {
                System.out.println(vehicle);
            }
        }
    }
}
