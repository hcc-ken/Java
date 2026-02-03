import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int menu () {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Agregar contacto");
        System.out.println("2. Modificar contactos");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Consultar contactos");
        System.out.println("5. Listar todos los contactos");
        System.out.println("6. Ordenar contactos por nombre");
        System.out.println("7. Salir");
        n = sc.nextInt();

        return n;
    }

    public static void agregarContacto(ArrayList <Contacto> agenda) {
        String nombre;
        String apellidos;
        int telefono;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese los apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Ingrese el telefono:");
        telefono = sc.nextInt();
        Contacto nuevoContacto = new Contacto (nombre, apellidos, telefono);
        agenda.add(nuevoContacto);
    }

    public static void modificarContacto(ArrayList <Contacto> agenda) {
        int num;
        String nombre;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                String nombreTemporal = agenda.get(j).getNombre();
                if (nombreTemporal.compareTo(agenda.get(i).getNombre()) > 0) {
                    Contacto temp = agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, temp);
                }
            }
        }

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }

        System.out.println("Seleccione el numero del contacto que quiera modificar.");
        num = sc.nextInt();

        System.out.println("Ingrese el nuevo nombre:");
        nombre = sc.nextLine();
        agenda.get(num).setNombre(sc.nextLine());

        System.out.println("Ingrese los nuevos apellidos:");
        agenda.get(num).setApellidos(sc.nextLine());

        System.out.println("Ingrese el nuevo telefono:");
        agenda.get(num).setTelefono(sc.nextInt());
    }

    public static void eliminarContacto(ArrayList <Contacto> agenda) {
        int num;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                String nombreTemporal = agenda.get(j).getNombre();
                if (nombreTemporal.compareTo(agenda.get(i).getNombre()) > 0) {
                    Contacto temp = agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, temp);
                }
            }
        }

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }

        System.out.println("Seleccione el numero del contacto que quiera eliminar.");
        num = sc.nextInt();
        agenda.remove(num);
    }

    public static void consultarContacto(ArrayList <Contacto> agenda) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del contacto que desea consultar:");
        num = sc.nextInt();

        System.out.println(agenda.get(num));
    }

    public static void listarContactos(ArrayList <Contacto> agenda) {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }
    }

    public static void ordenarContactos(ArrayList <Contacto> agenda) {
        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                String nombreTemporal = agenda.get(j).getNombre();
                if (nombreTemporal.compareTo(agenda.get(i).getNombre()) > 0) {
                    Contacto temp = agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, temp);
                }
            }
        }
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }
    }

    public static void main(String[] args) {
        int opcion;
        ArrayList <Contacto> agenda = new ArrayList<>();
        opcion = menu();

        while (opcion != 7) {

            switch (opcion) {
                case 1:
                    agregarContacto(agenda);
                    break;
                case 2:
                    modificarContacto(agenda);
                    break;
                case 3:
                    eliminarContacto(agenda);
                    break;
                case 4:
                    consultarContacto(agenda);
                    break;
                case 5:
                    listarContactos(agenda);
                    break;
                case 6:
                    ordenarContactos(agenda);
                    break;
            }
            opcion = menu();
        }
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
    }
}
