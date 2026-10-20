package Estates;

import Estates.CommercialProperties.Commericals.Commercial;
import Estates.CommercialProperties.Offices.Office;
import Estates.ResidentialProperties.Apartments.Families.Family;
import Estates.ResidentialProperties.Apartments.Studios.Studio;
import Estates.ResidentialProperties.Houses.Rurals.Rural;
import Estates.ResidentialProperties.Houses.Urbans.Gates.Gate;
import Estates.ResidentialProperties.Houses.Urbans.Independant;
import Sorteos.sorteo;
import Sorteos.moneda;
import Sorteos.dado;

public class Main {
    public static void main (String [] args) {
//        int value;
//        Estate [] estates = new Estate[7];
//        estates [0] = new Rural(); // esto es un upcasting. Metiendo en
//        estates [1] = new Gate();
//        estates [2] = new Independant();
//        estates [3] = new Studio();
//        estates [4] = new Family();
//        estates [5] = new Commercial();
//        estates [6] = new Office();
//
//        for (int i = 0; i < estates.length; i++) {
//            value = estates [i].obtainPurchaseValue();
//        }
//
//        for (int i = 0; i < estates.length; i++) {
//            System.out.println(estates [i].getIdentifier());
//        }
        sorteo sorteo1 = new dado();
        sorteo sorteo2 = new moneda();
        sorteo1.lanzar();
        sorteo2.lanzar();
    }
}
