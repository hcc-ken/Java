import java.util.InputMismatchException;

public class Articulo {
    private String nombre;
    private double precio;
    private double iva;
    private int cuantosQuedan;

    public Articulo (String nombre, double precio, double iva, int cuantosQuedan) {
        if (cuantosQuedan > 0) {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.out.println("Error.");
            this.nombre = "";
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    public String getNombre () {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = precio;;
        } else {
            System.out.println("El precio introducido incorrecto.");
            this.precio = 0;
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {

        }
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void imprime () {
        System.out.println("Artículo: " + nombre + " Precio sin IVA: " + precio + " El iva es de: " + 21 + " Quedan: " + cuantosQuedan);
    }

    public double getPVP () {
        return precio + (precio * 0.21);
    }

    public double getPVPDescuento (int descuento) {
        return getPVP() - (getPVP() * descuento / 100);
    }

    public boolean vender (int cantidad) {
        if (cantidad <= cuantosQuedan) {
            cuantosQuedan -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    boolean almacenar (int cantidad) {
        if (cantidad > 0) {
            cuantosQuedan += cantidad;
            return true;
        } else {
            return false;
        }
    }

}
