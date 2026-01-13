import java.util.Scanner;

public class Main {
    public static int menu () {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Pedir golosinas.");
        System.out.println("2. Mostrar golosinas.");
        System.out.println("3. Rellenar golosinas.");
        System.out.println("4. Salir.");
        opcion = sc.nextInt();
        return opcion;
    }
    public static void main (String[] args) {
        int opcion = 0;
        double ventas = 0;
        String password;

        Scanner sc = new Scanner(System.in);


        Golosina g1 = new Golosina("KitKat", 1.1, 5);
        Golosina g2 = new Golosina("Chicles de fresa", 0.8, 5);
        Golosina g3 = new Golosina("Lacasitos", 1.5, 5);
        Golosina g4 = new Golosina("Palotes", 0.9, 5);
        Golosina g5 = new Golosina("Kinder Bueno", 1.8, 5);
        Golosina g6 = new Golosina("Bolsa variada Haribo", 1.0, 5);
        Golosina g7 = new Golosina("Chetoos", 1.2, 5);
        Golosina g8 = new Golosina("Twix", 1.0, 5);
        Golosina g9 = new Golosina("Kinder Choco", 1.8, 5);
        Golosina g10 = new Golosina("M&M'S", 1.3, 5);
        Golosina g11 = new Golosina("Papa Delta", 1.2, 5);
        Golosina g12 = new Golosina("Chicles de menta", 0.8, 5);
        Golosina g13 = new Golosina("Chicles Sandia", 1.5, 5);
        Golosina g14 = new Golosina("Crunch", 1.1, 5);
        Golosina g15 = new Golosina("Milkybar", 1.1, 5);
        Golosina g16 = new Golosina("KitKat Blanco", 1.1, 5);

        Golosina[][] golosina = new Golosina[][] {
                {g1, g2, g3, g4},
                {g5, g6, g7, g8},
                {g9, g10, g11, g12},
                {g13, g14, g15, g16}
        };
            golosina[1][2].getCantidad();

        do {
            opcion = menu();
            switch (opcion){
                case 1:
                    int fila, columna;
                    System.out.println("Introduce primer digito: ");
                    fila = sc.nextInt();
                    System.out.println("Introduce segundo digito: ");
                    columna = sc.nextInt();
                    if (golosina[fila][columna].getCantidad() > 0) {
                        System.out.println("Ha elegido: " + golosina[fila][columna].getNombre() +  " Cuesta: " + golosina[fila][columna].getPrecio() + " euros.");
                        golosina[fila][columna].setCantidad(-1);
                        ventas += golosina[fila][columna].getPrecio();
                    } else {
                        System.out.println("Lo siento, no queda stock de ese producto.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < golosina.length; i++) {
                        for (int j = 0; j < golosina[i].length; j++) {
                            System.out.println(golosina[i][j].getNombre() + " " + golosina[i][j].getPrecio() + " euros");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la contraseña: ");
                    password = sc.next();
                    if (password.equals("Maquina2021")) {
                        for (int i = 0; i < golosina.length; i++) {
                            for (int j = 0; j < golosina[i].length; j++) {
                                golosina[i][j].setCantidad(5);
                            }
                        }
                    } else {
                        System.out.println("Contraseña incorrecta.");
                        break;
                    }
                    System.out.println("Golosinas rellenadas.");
                    break;
                case 4:
                    System.out.println("Total de ventas: " + ventas + " euros.");
                    System.out.println("Saliendo del programa.");
                    ventas = 0;
                    break;
            }
            } while (opcion != 4);
        }
}