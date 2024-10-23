package oopdefendtasks;

public class Car extends Vehicle {
    public Car(String brand, String model, int year, double price) {
        super(brand, model, year, price);
    }

    @Override
    public String getType() {
        return "Car";
    }
}
