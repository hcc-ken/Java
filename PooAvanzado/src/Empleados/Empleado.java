package Empleados;

public abstract class Empleado {
    protected String nombre;
    protected int edad;
    protected double salario;

    public static final int PLUS = 300;

    public Empleado (String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + "\n edad " + edad + "\n salario " + salario;
    }

    public abstract boolean plus();
}
