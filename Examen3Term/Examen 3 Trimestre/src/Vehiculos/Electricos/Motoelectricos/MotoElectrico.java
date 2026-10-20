package Vehiculos.Electricos.Motoelectricos;
import Vehiculos.Electricos.Electrico;
import Vehiculos.MantenimientoCadena;

public class MotoElectrico extends Electrico implements MantenimientoCadena {
    private int giroManillar;

    public MotoElectrico(){
        super();
        giroManillar = 100;
    }

    public MotoElectrico(String marca, String modelo, String matricula, int año_fabricacion, String nombre, int potenciaMaxima, int capacidad, int cargaActual, int giroManillar) {
        super(marca, modelo, matricula, año_fabricacion, nombre, potenciaMaxima, capacidad, cargaActual);
        this.giroManillar = giroManillar;

        if (giroManillar < 45 || giroManillar > 180) {
            System.out.println("El giro del manillar debe estar entre 45 y 180 grados." +
                    "se ha establecido un valor por defecto de 100 grados.");
            this.giroManillar = 100;
        } else {
            this.giroManillar = giroManillar;
        }
    }

    @Override
    public void cargar() {
        this.cargaActual -= 2;
    }

    @Override
    public double facturarMantenimiento() {
        return 56;
    }

    @Override
    public void tensar() {
        System.out.println("Moto elektrisante");
        System.out.println("Tensando la cadena de la moto electrica.");
    }
}
