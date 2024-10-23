package oopdefendtasks;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_PATH = "vehicles.dat"; 

    public static void saveVehicles(List<Vehicle> vehicles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(vehicles); 
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Vehicle> loadVehicles() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Vehicle>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
