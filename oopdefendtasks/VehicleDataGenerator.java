
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDataGenerator {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();


        vehicles.add(new Car("Toyota", "Camry", 2020, 24000.99));
        vehicles.add(new Truck("Ford", "F-150", 2019, 35000.50));
        vehicles.add(new Motorcycle("Harley-Davidson", "Sportster", 2021, 15000.75));
        vehicles.add(new Car("Honda", "Civic", 2022, 22000.00));
        vehicles.add(new Truck("Chevrolet", "Silverado", 2018, 40000.99));
        vehicles.add(new Motorcycle("Yamaha", "MT-09", 2023, 12500.99));

        try {
            FileManager.saveVehicles(vehicles);
            System.out.println("Vehicle data generated and saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving vehicle data: " + e.getMessage());
        }
    }
}
