import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main() {
//        // Ejercicio 4
//                Random rand = new Random();
//                ArrayList<Carta> baraja = new ArrayList<>();
//                ArrayList<Carta> mano = new ArrayList<>();
//                int mazo;
//                Carta cartaSeleccionada;
//                //Ahora construimos las 48 cartas de la baraja.
//
//                for (int i = 1; i <= 12; i++) {
//                    baraja.add(new Carta(i, "Bastos"));
//                    baraja.add(new Carta(i, "Copas"));
//                    baraja.add(new Carta(i, "Espadas"));
//                    baraja.add(new Carta(i, "Oros"));
//                }
//                //System.out.println("Baraja: " + baraja); //Aqui vemos que esta to_do ok CHECKPOINT
//
//                for (int i = 0; i < 10; i++) {
//                    mazo = rand.nextInt(baraja.size()); //el automaticamente va decrementando el tamaño por el size.
//                    mano.add(baraja.remove(mazo));
//                    //cartaSeleccionada = baraja.remove(indice);
//                    //mano.add(cartaSeleccionada); //Linea 24 y 25 equivale a la 23.
//                }
//
//        for (int i = 0; i < mano.size() - 1; i++) {
//            for (int j = i + 1; j < mano.size(); j++) {
//                int palo = mano.get(i).getPalo().compareTo(mano.get(j).getPalo()); //con este bucle ordenamos por palo
//
//                if (palo > 0 || (palo == 0 && mano.get(i).getNumero() > mano.get(j).getNumero())) {
//                    Carta temp = mano.get(i);
//                    mano.set(i, mano.get(j));
//                    mano.set(j, temp);
//                }
//            }
//        }
//
//                System.out.println("Mano: " + mano);
//                System.out.println("estas son las cartas que quedan en la baraja tras la seleccion: " + baraja);
//    }
//}
        // Ejercicio 3
//                Random rand = new Random();
//                ArrayList<Carta> baraja = new ArrayList<>();
//                ArrayList<Carta> mano = new ArrayList<>();
//                int mazo;
//                Carta cartaSeleccionada;
//                //Ahora construimos las 48 cartas de la baraja.
//
//                for (int i = 1; i <= 12; i++) {
//                    baraja.add(new Carta(i, "Oros"));
//                    baraja.add(new Carta(i, "Bastos"));
//                    baraja.add(new Carta(i, "Espadas"));
//                    baraja.add(new Carta(i, "Copas"));
//                }
//                //System.out.println("Baraja: " + baraja); //Aqui vemos que esta to_do ok CHECKPOINT
//
//                for (int i = 0; i < 10; i++) {
//                    mazo = rand.nextInt(baraja.size()); //el automaticamente va decrementando el tamaño por el size.
//                    mano.add(baraja.remove(mazo));
//                    //cartaSeleccionada = baraja.remove(indice);
//                    //mano.add(cartaSeleccionada); //Linea 24 y 25 equivale a la 23.
//                }
//                System.out.println("Mano: " + mano);
//                System.out.println("estas son las cartas que quedan en la baraja tras la seleccion: " + baraja);

        //Ejercicio 2
//        ArrayList <String> palabras = new ArrayList();
//        for (int i = 1; i <= 10; i++) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Introduzca una palabra.");
//            palabras.add(sc.nextLine());
//        }
//
//        for (int i = 0; i < palabras.size(); i++) {
//            String palabraActual = palabras.get(i);
//            for (int j = 1; j < palabras.size(); j++) {
//                int resultado = palabraActual.compareTo(palabras.get(j));
//                if (resultado < 0) {
//                    String palabraMenor = palabras.get(j);
//                    palabras.set(j, palabraActual);
//                    palabras.set(i, palabraMenor);
//                    palabraActual = palabraMenor;
//                }
//            }
//        }
//        System.out.println(palabras + "");

        // Ejercicio 1
//        Random random = new Random();
//        ArrayList numeros = new ArrayList();
//        int n = 0;
//        int restos = 0;
//        do {
//            n = random.nextInt(100);
//            restos = n % 2;
//            if (restos != 0) {
//                numeros.add(n);
//
//            } else {
//                numeros.add(0, n);
//            }
//        } while (n != 50);
//        System.out.println(numeros + "");
