package oopdefendtasks;

public class Tester {
    public static void main(String[] args) {
        FleetManager manager = new FleetManager();

        manager.addVehicle(new Car("Toyota", "Camry", 2020, 24000.99));
        manager.addVehicle(new Truck("Ford", "F-150", 2019, 35000.50));
        manager.addVehicle(new Motorcycle("Harley-Davidson", "Sportster", 2021, 15000.75));

        manager.saveFleet();
        manager.loadFleet();
        manager.displayFleet();
    }
}
