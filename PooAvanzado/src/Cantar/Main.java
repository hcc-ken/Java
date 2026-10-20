package Cantar;

public class Main {
    public static void main (String[] args) {
        PuedeCantar canario = new Canario();
        PuedeCantar tenor = new Persona();

        canario.cantar();
        tenor.cantar();
    }
}
