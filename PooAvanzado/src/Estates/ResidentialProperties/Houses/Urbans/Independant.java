package Estates.ResidentialProperties.Houses.Urbans;

public class Independant extends Urban {

    public Independant() {
        super();
    }

    public Independant (int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
    }

    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Independant.");
        return 3000 * area;
    }
}
