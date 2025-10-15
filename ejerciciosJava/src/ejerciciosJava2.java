import java.util.Scanner;
/*
USO DEL BUCLE
 */

public class ejerciciosJava2 {
    public static void main(String[] args){
                /* Ejercicio1
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana.");
        String dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case ("lunes"):
                System.out.println("Tienes Sistemas Informáticos");
                break;

            case ("martes"):
                System.out.println("Tienes Programación");
                break;

            case ("miercoles"):
                System.out.println("Tienes Programación");
                break;

            case ("jueves"):
                System.out.println("Tienes Bases de Datos");
                break;

            case ("viernes"):
                System.out.println("Tienes Entorno de Desarrollo");
                break;

            default:
                System.out.println("No tienes clase.");
        }
         */

        /* Ejercicio 2
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué hora es?");
        n = sc.nextInt();
        if (n == 6 || n <= 12){
            System.out.println("Buenos días.");
        } else if (n == 13 || n <=20) {
            System.out.println("Buenas tardes.");
        } else {
            System.out.println("Buenas noches.");
        }
         */


        /*Ejercicio 3
        float n1;
        float n2;
        float notafinal;
        String recu;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota.");
        n1 = sc.nextFloat();
        System.out.println("Introduzca la segunda nota.");
        n2 = sc.nextFloat();
        notafinal = (n1 + n2) / 2;
        if (notafinal >= 5) {
            System.out.println("Aprobado con un "  + notafinal);
        } else {
            System.out.println("La recuperación: Apto o No apto?");
            sc.nextLine();
            recu = sc.nextLine().toLowerCase();

            if (recu.equals("apto")){
                System.out.println("Aprobado con un 5.");
            } else {
                System.out.println("Su nota final es un " + notafinal);
            }
        }
         */

        /*Ejercicio 5
        for (int n = 0; n < 100; n += 5){
            System.out.println("La multiplicación es " + n);
        }
         */

        /*Ejercicio 6
        int contador = 0;
        int mult;
        while (contador < 100){
            mult = contador * 5;
            contador += 1;
            System.out.println("La respuesta es " + mult);
        }
         */

        /*Ejercicio 7
        int contador = 0;
        int mult;
        do{
            mult = contador * 5;
            contador += 1;
            System.out.println("La respuesta es " + mult);
        } while (contador < 100);
         */

        /*Ejercicio 8
        int resultado = 0;

        for (int n = 320; n >= 180; n -= 20) {

            System.out.println("Resultado " + n);

        }
         */


        /* Ejercicio 9
        int contador = 320;

        while (contador >= 160){
            System.out.println(contador);
                        contador -= 20;
        }
         */

        /*Ejercicio 10
        int contador = 320;
        do {
            System.out.println("El resultado es " + resultado);
            contador -= 20;
        } while (contador > 160);
        */

        /*
        int password = 8888;
        int n;
        int intentos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la PIN.");

        do {
            n = sc.nextInt();
            if (n == password) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            } else {
                System.out.println("La contraseña es errónea, inténtelo de nuevo.");
                intentos ++;
            }
        } while (intentos < 4  && n != password);
        */

                int n;
        int noriginal;
        int respuesta;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número.");
        n = sc.nextInt();

        do {
            contador += 1;
            n = n % 10;
        } while (n < 0);

        System.out.println("Tiene " + contador + " cifras");
    }
}
