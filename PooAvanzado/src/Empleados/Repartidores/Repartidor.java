package Empleados.Repartidores;

import Empleados.Empleado;

public class Repartidor extends Empleado {
    String zona;

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public boolean plus() {
        boolean resultado;

        if (zona.equals("zona 3") && edad < 25) {
            salario += 300;
            return true;
        }
        return false;
    }
}
