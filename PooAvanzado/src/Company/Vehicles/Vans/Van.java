package Company.Vehicles.Vans;

import Company.Vehicles.Vehicle;

public class Van extends Vehicle {
    private int packageCapacity;
    private int currentPackages;

    final int DEFAULT_PACKAGECAPACITY = 0;
    final int DEFAULT_CURRENTPACKAGES = 0;

    public Van(){
        super();
        packageCapacity = DEFAULT_PACKAGECAPACITY;
        currentPackages = DEFAULT_CURRENTPACKAGES;
    }

    public Van(String licensePlate, String brand, double mileage, int packageCapacity, int currentPackages) {
        super(licensePlate, brand, mileage);
        this.packageCapacity = packageCapacity;
        this.currentPackages = currentPackages;
    }

    public int getPackageCapacity() {
        return packageCapacity;
    }

    public void setPackageCapacity(int packageCapacity) {
        this.packageCapacity = packageCapacity;
    }

    public int getCurrentPackages() {
        return currentPackages;
    }

    public void setCurrentPackages(int currentPackages) {
        this.currentPackages = currentPackages;
    }

    public void addPackages(int increasePackage) {
        if (currentPackages < increasePackage) {
            currentPackages++;
        } else {
            System.out.println("No se puede incrementar más.");
        }
    }
}
