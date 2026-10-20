package Estates;

public abstract class Estate {
    protected int identifier;
    protected int area;
    protected String address;
    public static int contador = 0;

    public Estate() {
        contador++;
        identifier = contador;
        area = 0;
        address = "";
    }

    public Estate(int area, String address) {
        contador++;
        this.identifier = contador;
        this.area = area;
        this.address = address;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getArea() {
        return area;
    }

    public String getAddress() {
        return address;
    }

    public abstract int obtainPurchaseValue();
}
