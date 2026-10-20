package Vehiculos.Electricos.Cocheelectricos;

import Vehiculos.Electricos.Electrico;

public class CocheElectrico extends Electrico {
    private int numPlazas;
    
    public CocheElectrico() {
        super();
        int numPlazas = 5;
    }
    
    public CocheElectrico(String marca, String modelo, String matricula, int año_fabricacion, String nombre, int potenciaMaxima, int capacidad, int cargaActual, int numPlazas) {
        super(marca, modelo, matricula, año_fabricacion, nombre, potenciaMaxima, capacidad, cargaActual);
        this.numPlazas = numPlazas;
    }
    
    @Override
    public void cargar() {
        this.cargaActual = this.capacidad;
    }

    @Override
    public double facturarMantenimiento() {
        return 20 * numPlazas;
    }
}
