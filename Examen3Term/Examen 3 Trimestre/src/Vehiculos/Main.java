package Vehiculos;

import Vehiculos.Combustiones.Camiones.Camion;
import Vehiculos.Combustiones.Coches.Coche;
import Vehiculos.Combustiones.Combustion;
import Vehiculos.Combustiones.Motos.Moto;
import Vehiculos.Electricos.Cocheelectricos.CocheElectrico;
import Vehiculos.Electricos.Electrico;
import Vehiculos.Electricos.Motoelectricos.MotoElectrico;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiCulos = new Vehiculo[5];

        // Vehiculos
        vehiCulos[0] = new Camion("Mercedes", "Actros", "1234ABC", 2015, "Camion1", 1300, 400, 200, true, 20000);
        vehiCulos[1] = new Coche("Toyota", "Corolla", "5678DEF", 2020, "Coche1", 1800, 50, 30, false, 5, 450);
        vehiCulos[2] = new Moto("Honda", "CBR600RR", "9012GHI", 2018, "Moto1", 600, 20, 10, true, 120);
        vehiCulos[3] = new CocheElectrico("Tesla", "Model 3", "3456JKL", 2021, "CocheElectrico1", 450, 75, 50, 5);
        vehiCulos[4] = new MotoElectrico("Zero", "SR/F", "7890MNO", 2022, "MotoElectrico1", 110, 14, 7, 90);

        int vehiculosCombustion = 0;
        int vehiculosElectricos = 0;
        for (int i = 0; i < vehiCulos.length; i++) {
            System.out.println(vehiCulos[i].toString());
            if (vehiCulos[i] instanceof Combustion){
                ((Combustion) vehiCulos[i]).cambiarAceite();
                vehiculosCombustion++;
            } else if (vehiCulos[i] instanceof Electrico) {
                ((Electrico) vehiCulos[i]).cargar();
                vehiculosElectricos++;
            }
        }

        double sumaMantenimiento = 0;
        for (int i = 0; i < vehiCulos.length; i++) {
            sumaMantenimiento += vehiCulos[i].facturarMantenimiento();
            // vehiCulos.convertTo(masAntiguo)
        }
        System.out.println("Total facturado por mantenimiento: " + sumaMantenimiento);
        System.out.println("Cantidad de vehículos de combustión: " + vehiculosCombustion);
        System.out.println("Cantidad de vehículos eléctricos: " + vehiculosElectricos);
    }
}
