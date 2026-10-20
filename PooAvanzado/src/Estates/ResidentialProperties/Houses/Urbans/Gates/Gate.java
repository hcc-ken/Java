package Estates.ResidentialProperties.Houses.Urbans.Gates;

import Estates.ResidentialProperties.Houses.Urbans.Urban;

public class Gate extends Urban {
    private int administrationValue;
    private boolean gatedCommunity;

    public Gate() {
        super();
        administrationValue = 0;
        gatedCommunity = false;
    }

    public Gate(int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors, int administrationValue, boolean gatedCommunity) {
        super(area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
        this.administrationValue = administrationValue;
        this.gatedCommunity = gatedCommunity;
    }

    public int getAdministrationValue() {
        return administrationValue;
    }

    public boolean isGatedCommunity() {
        return gatedCommunity;
    }

    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Gate.");
        return 2500 * area;
    }
}
