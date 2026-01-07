import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int opcion = 0;
        double ventas = 0;
        String password;
        String [][] nombre = { {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
                {"Kinder Choco", "M&M'S", "Papa Delta", "Chicles de menta"},
                {"Chicles Sandia", "Crunch", "Milkybar", "KitKat Blanco"} };

        double[][] precio = {{1.1, 0.8, 1.5, 0.9},
                {1.8, 1, 1.2, 1},
                {1.8, 1.3, 1.2, 0.8},
                {1.5, 1.1, 1.1, 1.1}};

        int [][] cantidad = {{5, 5, 5, 5},
                {5, 5, 5, 5},
                {5, 5, 5, 5},
                {5, 5, 5, 5}};
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Pedir golosinas.");
            System.out.println("2. Mostrar golosinas.");
            System.out.println("3. Rellenar golosinas.");
            System.out.println("4. Salir.");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    int fila, columna;
                    System.out.println("Introduce primer digito: ");
                    fila = sc.nextInt();
                    System.out.println("Introduce segundo digito: ");
                    columna = sc.nextInt();
                    if (cantidad[fila][columna] > 0) {
                        System.out.println("Ha elegido: " + nombre[fila][columna]+  " Cuesta: " + precio[fila][columna] + " euros.");
                        cantidad[fila][columna]--;
                        ventas += precio[fila][columna];
                    } else {
                        System.out.println("Lo siento, no queda stock de ese producto.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < nombre.length; i++) {
                        for (int j = 0; j < nombre[i].length; j++) {
                            System.out.println(nombre[i][j] + " " + precio[i][j] + " euros");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la contraseña: ");
                    password = sc.next();
                    if (password.equals("Maquina2021")) {
                        for (int i = 0; i < cantidad.length; i++) {
                            for (int j = 0; j < cantidad[i].length; j++) {
                                cantidad[i][j] = 5;
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
