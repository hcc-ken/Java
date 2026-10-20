package Vehiculos.Combustiones.Coches;
import Vehiculos.Combustiones.Combustion;

public class Coche extends Combustion {
    private int numPlazas;
    private int capacidadMaletero;

    public Coche(){
        super();
        int numPlazas = 0;
        int capacidadMaletero = 0;
    }

    public Coche(String marca, String modelo, String matricula, int año_fabricacion, String nombre, double cilindrada, double capacidadDeposito, double llenadoActual, boolean esGasolina, int numPlazas, int capacidadMaletero) {
        super(marca, modelo, matricula, año_fabricacion, nombre, cilindrada, capacidadDeposito, llenadoActual, esGasolina);
        this.numPlazas = numPlazas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public void cambiarAceite() {
        if (this.esGasolina) {
            System.out.println("40W");
        } else {
            System.out.println("60W");
        }
    }

    @Override
    public double facturarMantenimiento() {
        return cilindrada * 0.2;
    }

    @Override
    public String toString() {
        return super.toString() + "Numero de Plazas: " + numPlazas + "\n" +
                "Capacidad del Maletero: " + capacidadMaletero + "\n";
    }
}
