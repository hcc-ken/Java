package Company.Vehicles;

public class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected double mileage;

    final String DEFAULT_LICENSEPLATE = "";
    final String DEFAULT_BRAND = "";
    final double DEFAULT_MILEAGE = 0;

    public Vehicle() {
        licensePlate = DEFAULT_LICENSEPLATE;
        brand = DEFAULT_BRAND;
        mileage = DEFAULT_MILEAGE;
    }

    public Vehicle(String licensePlate, String brand, double mileage) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void addMileage(double amount) {
        this.mileage += amount;
    }
}
