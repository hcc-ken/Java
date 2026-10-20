package Estates.ResidentialProperties.Houses.Rurals;

import Estates.ResidentialProperties.Houses.House;

public class Rural extends House {
    private int distanceToTheCity;
    private int altitude;

    public Rural() {
        super();
        distanceToTheCity = 0;
        altitude = 0;
    }

    public Rural(int area, String address, int numberOfRooms, int numberOfBathrooms, int numberOfFloors, int distanceToTheCity, int altitude) {
        super(area, address, numberOfRooms, numberOfBathrooms, numberOfFloors);
        this.distanceToTheCity = distanceToTheCity;
        this.altitude = altitude;
    }

    public int getDistanceToTheCity() {
        return distanceToTheCity;
    }

    public int getAltitude() {
        return altitude;
    }

    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Rural.");
        return 1500 * area;
    }
}
