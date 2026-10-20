package Electrodomestics;

public class WashingMachine extends Electrodomestic{
    protected double load;

    final double DEFAULT_LOAD = 5;

    public WashingMachine() {
        super();
        load = DEFAULT_LOAD;
    }

    public WashingMachine(double priceBase, double weight) {
        super(priceBase, weight);
        load = DEFAULT_LOAD;
    }

    public WashingMachine(double priceBase, String color, char energeticConsumption, double weight, double load) {
        super(priceBase, color, energeticConsumption, weight);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return super.toString() + ", load: " + load;
    }
}
