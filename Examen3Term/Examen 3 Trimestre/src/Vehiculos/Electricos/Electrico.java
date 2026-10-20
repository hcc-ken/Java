package Vehiculos.Electricos;

import Vehiculos.Vehiculo;

public abstract class Electrico extends Vehiculo {
    protected int potenciaMaxima;
    protected int capacidad;
    protected int cargaActual;
    static int contadorElectricos;

    public Electrico () {
        super();
        int potenciaMaxima = 0;
        int capacidad = 0;
        int cargaActual = 0;
        contadorElectricos++;
    }

    public Electrico (String marca, String modelo, String matricula, int año_fabricacion, String nombre, int potenciaMaxima, int capacidad, int cargaActual) {
        super(marca, modelo, matricula, año_fabricacion, nombre);
        this.potenciaMaxima = potenciaMaxima;
        this.capacidad = capacidad;
        this.cargaActual = cargaActual;
        contadorElectricos++;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public abstract void cargar();

    @Override
    public String toString() {
        return super.toString() + "Potencia Maxima: " + potenciaMaxima + "\n" +
                "Capacidad: " + capacidad + "\n" +
                "Carga Actual: " + cargaActual + "\n";
    }
}
