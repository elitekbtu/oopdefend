package oopdefendtasks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FleetManager {
    private List<Vehicle> fleet = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addVehicle() {
        System.out.println("Select vehicle type (1. Car, 2. Truck, 3. Motorcycle): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Vehicle vehicle;
        switch (choice) {
            case 1:
                vehicle = new Car(brand, model, year, price);
                break;
            case 2:
                vehicle = new Truck(brand, model, year, price);
                break;
            case 3:
                vehicle = new Motorcycle(brand, model, year, price);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        fleet.add(vehicle);
        System.out.println("Vehicle added.");
    }

    public void saveFleet() {
        try {
            FileManager.saveVehicles(fleet);
            System.out.println("Fleet saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving fleet: " + e.getMessage());
        }
    }

    public void loadFleet() {
        try {
            fleet = FileManager.loadVehicles();
            System.out.println("Fleet loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading fleet: " + e.getMessage());
        }
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

    public static void main(String[] args) {
        FleetManager manager = new FleetManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Vehicle");
            System.out.println("2. Save Fleet");
            System.out.println("3. Load Fleet");
            System.out.println("4. Display Fleet");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.addVehicle();
                    break;
                case 2:
                    manager.saveFleet();
                    break;
                case 3:
                    manager.loadFleet();
                    break;
                case 4:
                    manager.displayFleet();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

