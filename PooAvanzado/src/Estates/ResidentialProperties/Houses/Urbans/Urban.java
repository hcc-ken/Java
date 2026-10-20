package Estates.ResidentialProperties.Houses.Urbans;

import Estates.ResidentialProperties.Houses.House;

public abstract class Urban extends House {
    public Urban() {
        super();
    }

    public Urban(int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors) {
        super(area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
    }
}
