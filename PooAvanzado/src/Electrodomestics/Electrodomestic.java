package Electrodomestics;

public class Electrodomestic {
    protected double priceBase;
    protected String color;
    protected char energeticConsumption;
    protected double weight;

    final double DEFAULT_PRICE = 100;
    final String DEFAULT_COLOR = "white";
    final char DEFAULT_CONSUMPTION = 'F';
    final double DEFAULT_WEIGHT = 5;

    public Electrodomestic() {
        priceBase = DEFAULT_PRICE;
        color = DEFAULT_COLOR;
        energeticConsumption = DEFAULT_CONSUMPTION;
        weight = DEFAULT_WEIGHT;
    }

    public Electrodomestic(double priceBase, double weight) {
        this.priceBase = priceBase;
        color = DEFAULT_COLOR;
        energeticConsumption = DEFAULT_CONSUMPTION;
        this.weight = weight;
    }

    public Electrodomestic(double priceBase, String color, char energeticConsumption, double weight) {
        this.priceBase = priceBase;
//        this.color = color;
        checkColor(color);
//        this.energeticConsumption = energeticConsumption;
        checkEnergeticConsumption(energeticConsumption);
        this.weight = weight;
    }

    public double getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(double priceBase) {
        this.priceBase = priceBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        checkColor(color);
    }

    public char getEnergeticConsumption() {
        return energeticConsumption;
    }

    public void setEnergeticConsumption(char energeticConsumption) {
        this.energeticConsumption = energeticConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private void checkEnergeticConsumption(char letter) {
        letter = Character.toUpperCase(letter);
        if (letter >= 'A' && letter <= 'F') {
            energeticConsumption =  letter;
        } else energeticConsumption = DEFAULT_CONSUMPTION;
    }

    private void checkColor (String color) {
        if (color.equals("white") || color.equals("black") || color.equals("red") || color.equals("blue") || color.equals("grey")) {
            this.color = color;
        } else this.color = DEFAULT_COLOR;
    }

    @Override
    public String toString() {
        return "This is an electrodomestic";
    }
}
