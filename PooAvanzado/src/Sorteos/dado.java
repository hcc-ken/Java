package Sorteos;

import java.util.Random;

public class dado extends sorteo{


    @Override
    public void lanzar() {
        Random random = new Random();
        posibilidades = random.nextInt(1, 7);
        System.out.println("Su número es: " + posibilidades);
    }
}
