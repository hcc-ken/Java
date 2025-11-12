import java.util.Scanner;
public static int resultado (int multiplicacion) {
    int n = 1;
    while (n > 0) {
        n = multiplicacion % 10;
    }
    System.out.println(n);
    return n;
}

 public static void main (String [] args) {
     int n, multiplicacion, contador = 1;
     Scanner sc = new Scanner(System.in);

     System.out.println("Introduzca un número.");
     multiplicacion = sc.nextInt();
     do {
         System.out.println("Introduzca un número.");
         n = sc.nextInt();

         multiplicacion = n * multiplicacion;
         contador = contador + 1;

     } while (contador < 10 && multiplicacion < 5000);

     System.out.println(multiplicacion);
     resultado(multiplicacion);
 }

/* Ejercicio 3
public class ejerciciosExamen {
    public static int leenumero () {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entre 2 y 9, ambos incluidos.");
        n = sc.nextInt();

        if (n < 2 || n > 9) {
            do {
                System.out.println("Introduzca un número entre 2 y 9, ambos incluidos.");
                n = sc.nextInt();
            } while (n < 2 || n > 9);
        }
        return n;
    }

    public static int divison (int n) {
        int resultado = 0;
        for (int i = 100; i < 1000; i++) {
            int division;
            division = i % n;
            if (division == 0) {
                System.out.println(i);
            }
        }
        return resultado;
    }
    public static void main (String[] args) {
        int n = leenumero();
        divison(n);
    }
 */


    /*
    Ejercicio 2public static void main (String[] args) {
        try {
            int n, restos, b500, b200, b100, b50, b20, b10, b5, b2, b1;

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca una cantidad.");
            n = sc.nextInt();

            b500 = n / 500;
            restos = n % 500;

            b200 = restos / 200;
            restos = restos % 200;

            b100 = restos / 100;
            restos = restos % 100;

            b50 = restos / 50;
            restos = restos % 50;

            b20 = restos / 20;
            restos = restos % 20;

            b10 = restos / 10;
            restos = restos % 10;

            b5 = restos / 5;
            restos = restos % 5;

            b2 = restos / 2;
            restos = restos % 2;

            b1 = restos / 1;

            System.out.println("Se ha usado " + b500 + " billetes de 500");
            System.out.println("Se ha usado " + b200 + " billetes de 200");
            System.out.println("Se ha usado " + b100 + " billetes de 100");
            System.out.println("Se ha usado " + b50 + " billetes de 50");
            System.out.println("Se ha usado " + b20 + " billetes de 20");
            System.out.println("Se ha usado " + b10 + " billetes de 10");
            System.out.println("Se ha usado " + b5 + " billetes de 5");
            System.out.println("Se ha usado " + b2 + " monedas de 2");
            System.out.println("Se ha usado " + b1 + " monedas de 1");
        }

        catch (InputMismatchException e) {
            System.out.println("El número introducido debe de ser entero.");
        }
    }
     */



    /* Ejercicio 1
    public static void main (String[] args) {
        int pHora, hMes;
        double resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuánto cobra la hora.");
        pHora = sc.nextInt();

        System.out.println("Introduzca cuántas horas trabaja al mes.");
        hMes = sc.nextInt();

        resultado = pHora * hMes;

        System.out.println("Su salario bruto al mes es de: " + resultado + " euros.");
        if (resultado < 1000) {
            resultado = resultado - (resultado * 0.10);
            System.out.println("Su salario neto al mes es de: " + resultado + " euros al mes.");
        } else if (resultado > 1000 && resultado < 2000) {
            resultado = resultado - (resultado * 0.16);
            System.out.println("Su salario neto al mes es de: " + resultado + " euros al mes.");
        } else {
            resultado = resultado - (resultado * 0.20);
            System.out.println("Su salario neto al mes es de: " + resultado + " euros al mes.");
        }
    }
     */