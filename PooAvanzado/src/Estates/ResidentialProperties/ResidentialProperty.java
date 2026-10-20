package Estates.ResidentialProperties;

import Estates.Estate;

public abstract class ResidentialProperty extends Estate {
    protected int numberOfRooms;
    protected int numberOfBathrooms;

    public ResidentialProperty(){
        super();
        numberOfRooms = 0;
        numberOfBathrooms = 0;
    }

    public ResidentialProperty(int area, String address, int numberOfRooms, int numberOfBathrooms) {
        super(area, address);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
}
