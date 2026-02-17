import java.util.Scanner;

public class TarjetaTransporte {
    private String codigo;
    private String titular;
    private double saldo;

    public TarjetaTransporte(String codigo, String titular, double saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = 5;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void iniciaViaje() {
        if (saldo < 1.20) {
            System.out.println("Acceso no autorizado. Saldo insuficiente.");
        } else {
            System.out.println("Buen viaje!");
            this.saldo -= 1.20;
        }
    }

    public void recargaTarjeta(double recarga) {
        if (recarga == 5 || recarga == 10 || recarga == 20) {
            this.saldo += recarga;
            System.out.println("Recarga completada. Le queda: " + saldo);
        } else {
            System.out.println("Importe de recarga erroneo. Recarga fallida.");
        }
    }
}
