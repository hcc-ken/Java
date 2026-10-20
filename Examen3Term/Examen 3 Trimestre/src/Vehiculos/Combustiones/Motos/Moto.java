package Vehiculos.Combustiones.Motos;
import Vehiculos.Combustiones.Combustion;
import Vehiculos.MantenimientoCadena;

public class Moto extends Combustion implements MantenimientoCadena {
    private int anchoRueda;

    public Moto() {
        super();
        int anchoRueda = 0;
    }

    public Moto(String marca, String modelo, String matricula, int año_fabricacion, String nombre, double cilindrada, double capacidadDeposito, double llenadoActual, boolean esGasolina, int numPlaza) {
        super(marca, modelo, matricula, año_fabricacion, nombre, cilindrada, capacidadDeposito, llenadoActual, esGasolina);
        this.anchoRueda = anchoRueda;
    }

    @Override
    public double facturarMantenimiento() {
        return cilindrada * 0.5 + anchoRueda * 0.25;
    }

    @Override
    public void tensar() {
        System.out.println("Moto combustion espontanea");
        System.out.println("Tensando la cadena de la moto...");
    }
}
