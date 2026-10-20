package Estates.ResidentialProperties.Apartments;

import Estates.ResidentialProperties.ResidentialProperty;

public abstract class Apartment extends ResidentialProperty {
    protected int administrationValue;

    public Apartment() {
        super();
        administrationValue = 0;
    }

    public Apartment(int area, String address, int numberOfRooms, int numberOfBathrooms, int administrationValue) {
        super(area, address, numberOfRooms, numberOfBathrooms);
        this.administrationValue = administrationValue;
    }

    public int getAdministrationValue() {
        return administrationValue;
    }
}
