package Empleados.Comerciales;

import Empleados.Empleado;

public class Comercial extends Empleado {
    double comision;

    public Comercial(String nombre, int edad, double salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public boolean plus() {
        if (edad >= 30 && comision > 200) {
            salario += 300;
            return true;
        }
        return false;
    }
}
