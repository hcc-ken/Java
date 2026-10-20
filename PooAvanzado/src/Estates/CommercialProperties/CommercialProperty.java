package Estates.CommercialProperties;

import Estates.Estate;

public abstract class CommercialProperty extends Estate {
    protected boolean locationExterior;

    public CommercialProperty() {
        super();
        locationExterior = false;
    }

    public CommercialProperty(int area, String address, boolean locationExterior) {
        super(area, address);
        this.locationExterior = locationExterior;
    }

    public boolean isLocationExterior() {
        return locationExterior;
    }
}
