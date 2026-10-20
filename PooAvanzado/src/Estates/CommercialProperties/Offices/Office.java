package Estates.CommercialProperties.Offices;

import Estates.CommercialProperties.CommercialProperty;

public class Office extends CommercialProperty {
    private boolean gov;

    public Office () {
        super();
        gov = false;
    }

    public Office (int area, String address, boolean locationExterior, boolean gov) {
        super(area, address, locationExterior);
        this.gov = gov;
    }

    @Override
    public int obtainPurchaseValue() {
        System.out.println("Executing obtainPurchaseValue of Office.");
        return 3500 * area;
    }
}
