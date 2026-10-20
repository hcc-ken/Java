package Vehiculos.Combustiones;

import Vehiculos.Vehiculo;

public abstract class Combustion extends Vehiculo {
    protected double cilindrada;
    protected double capacidadDeposito;
    protected double llenadoActual;
    protected boolean esGasolina;

    public Combustion() {
        super();
        double cilindrada = 0;
        double capacidadDeposito = 0;
        double llenadoActual = 0;
        boolean esGasolina = false;
    }

    public Combustion (String marca, String modelo, String matricula, int año_fabricacion, String nombre, double cilindrada, double capacidadDeposito, double llenadoActual, boolean esGasolina) {
        super(marca, modelo, matricula, año_fabricacion, nombre);
        this.cilindrada = cilindrada;
        this.capacidadDeposito = capacidadDeposito;
        this.llenadoActual = llenadoActual;
        this.esGasolina = esGasolina;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(double capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public double getLlenadoActual() {
        return llenadoActual;
    }

    public void setLlenadoActual(double llenadoActual) {
        this.llenadoActual = llenadoActual;
    }

    public boolean isEsGasolina() {
        return esGasolina;
    }

    public void setEsGasolina(boolean esGasolina) {
        this.esGasolina = esGasolina;
    }

    public void cambiarAceite() {
        if (this.cilindrada > 1200) {
            System.out.println("Aceite sintético.");
        } else {
            System.out.println("Aceite Mineral.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Cilindrada: " + cilindrada + "\n" +
                "Capacidad del Deposito: " + capacidadDeposito + "\n" +
                "Llenado Actual: " + llenadoActual + "\n" +
                "Es Gasolina: " + esGasolina + "\n";
    }
}
