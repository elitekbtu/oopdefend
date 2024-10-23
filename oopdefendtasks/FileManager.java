package  oopdefendtasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static final String FILE_PATH = "vehicles.dat";

    public static void saveVehicles(List<Vehicle> vehicles) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(vehicles);
        }
    }

    public static List<Vehicle> loadVehicles() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Vehicle>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>(); 
        }
    }
}
