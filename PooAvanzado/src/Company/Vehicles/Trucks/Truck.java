package Company.Vehicles.Trucks;

import Company.Vehicles.Vehicle;

public class Truck extends Vehicle {
    private double loadCapacity;

    final double DEFAULT_LOADCAPACITY = 0;

    public Truck() {
        super();
        loadCapacity = DEFAULT_LOADCAPACITY;
    }

    public Truck(String licensePlate, String brand, double mileage, double load) {
        super(licensePlate, brand, mileage);
        this.loadCapacity = load;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean checkLoad(double weight){
        return weight <= this.loadCapacity;
    }
}
