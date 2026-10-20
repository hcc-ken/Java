package Sorteos;

import java.util.Random;

public class moneda extends sorteo {


    @Override
    public void lanzar() {
        int moneda = 0;
        Random random = new Random();
        moneda = random.nextInt(0,2);
        if (moneda == 0) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }
    }
}
