package Estates.CommercialProperties.Commericals;

import Estates.CommercialProperties.CommercialProperty;

public class Commercial extends CommercialProperty {
    private String location;

    public Commercial () {
        super();
        location = "";
    }

    public Commercial (int area, String address, boolean locationExterior, String location) {
        super(area, address, locationExterior);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Commercial.");
        return 3000 * area;
    }
}
