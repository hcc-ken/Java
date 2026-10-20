package Vehiculos.Combustiones.Camiones;

import Vehiculos.Combustiones.Combustion;

public class Camion extends Combustion {
    private int cargaMax;

    public Camion(){
        super();
        int cargaMax = 0;
    }

    public Camion(String marca, String modelo, String matricula, int año_fabricacion, String nombre, double cilindrada, double capacidadDeposito, double llenadoActual, boolean esGasolina, int cargaMax) {
        super(marca, modelo, matricula, año_fabricacion, nombre, cilindrada, capacidadDeposito, llenadoActual, esGasolina);
        this.cargaMax = cargaMax;
    }

    @Override
    public void cambiarAceite() {
        if (this.cilindrada > 1200) {
            System.out.println("Aceite sintético.");
        } else {
            System.out.println("Aceite Mineral.");
        }

        System.out.println("120W");
    }

    @Override
    public double facturarMantenimiento() {
        return cilindrada * 0.8 + 260;
    }
}
