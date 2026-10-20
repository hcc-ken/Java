package Vehiculos;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String matricula;
    protected int anio_fabricacion;
    protected String nombre;

    public Vehiculo() {
        String marca = "";
        String modelo = "";
        String matricula = "";
        int anio_fabricacion = 0;
        String nombre = "";
    }

    public Vehiculo(String marca, String modelo, String matricula, int año_fabricacion, String nombre) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio_fabricacion = año_fabricacion;
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(int anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double facturarMantenimiento();

    public int compareTo(Vehiculo v){
        return v.getAnio_fabricacion() - this.getAnio_fabricacion();
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", anio_fabricacion=" + anio_fabricacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
