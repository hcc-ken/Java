import javax.lang.model.type.ArrayType;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/* Ejercicio 1
public static double mult (double n1, double n2){
        double resultado;
        resultado = n1 * n2;

        return resultado;
    }

    public static void main(String[] args) {
        double n1;
        double n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1.");
        n1 = sc.nextDouble();

        System.out.println("Introduzca número 2.");
        n2 = sc.nextDouble();

        System.out.println("El resultado es " + mult(n1, n2));
    }
 */

/* Ejercicio 2
    public static boolean esMayorEdad (int n){
        return n >= 18;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca su edad.");
        n = sc.nextInt();

        System.out.println(esMayorEdad(n));
    }
 */

/* Ejercico 3
    public static double precio (double n){
        n = n * 1.21;
        return n;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            double n;

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el precio del producto.");
            n = sc.nextInt();

            System.out.println("Precio con IVA: " + precio(n));
        }
    }
 */

/* Ejercicio 4
    public static int precio (int n1, int n2){
        if (n1 < n2) {
            n1 = n2;
        }
        return n1;
    }

    public static void main(String[] args) {
        int n1, n2, max;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca número 1.");
        n1 = sc.nextInt();

        System.out.println("Introduzca número 2");
        n2 = sc.nextInt();

        max = precio(n1, n2);

        System.out.println("Introduzca número 3");
        n2 = sc.nextInt();

        max = precio(n1, n2);

        System.out.println("El número máximo es: " + max);
    }
 */

/* Ejercicio 5
public static double precio (double n1, double n2){
        double descuento;

        descuento = 100 - ((n2 * 100) / n1);
        return descuento;
    }

    public static void main(String[] args) {
        double n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el precio sin descuento");
        n1 = sc.nextDouble();

        System.out.println("Introduzca el precio con descuento.");
        n2 = sc.nextDouble();

        System.out.println("El precio rebajado es: " + precio(n1, n2));
    }
 */

/* Ejercicio 6
 public static int mult (int n){
        int resultado = 0;

        for (int i = 0; i <= 10; i++) {
            int multiplicacion = n * i;
            resultado = multiplicacion;
            System.out.println(resultado);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número.");
        n = sc.nextInt();

        System.out.println(mult(n));
    }
 */

/* Ejercicio 7
public static int menu (){
        int opcion;

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circunferencia.");
        System.out.println("2. Área.");
        System.out.println("3. Volumen.");
        System.out.println("4. Todo.");
        System.out.println("5. Salir");
        System.out.println("Introduzca número.");
        opcion = sc.nextInt();
        return opcion;
    }

    public static double dobleradio () {
        double nradio;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la radio");
        nradio = sc.nextDouble();

        return nradio;
    }

    public static double circunferencia (double r) {
        double circunferencia;

        circunferencia = 2 * 3.14 * r;

        return circunferencia;
    }

    public static double area (double r) {
        double area;

        area = 3.14 * r * r;

        return area;
    }

    public static double volumen (double r) {
        double volumen;

        volumen = 4/3 * 3.14 * Math.pow(r, 3);

        return volumen;
    }


    public static void main(String[] args) {

        int exit = 0;

        do {
            int opcion = menu();

            if (opcion == 5) {
                exit = 5;
            }


            double r = dobleradio();

            switch (opcion){
                case 1:
                    System.out.println("La circunferencia es " + circunferencia(r));
                    break;

                case 2:
                    System.out.println("El área es " + area(r));
                    break;

                case 3:
                    System.out.println("El volumen es " + volumen(r));
                    break;

                case 4:
                    System.out.println("La circunferencia es " + circunferencia(r));
                    System.out.println("El área es " + area(r));
                    System.out.println("El volumen es " + volumen(r));
                    break;

        }


        } while (exit != 5);
    }
 */
        /*
        try {
            int resultado, n1, n2;

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca un número.");
            n1 = sc.nextInt();
            System.out.println("Introduzca otro número.");
            n2 = sc.nextInt();

            int division = n1 / n2;

            System.out.println("El resultado es " + division);
        }

        catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0.");
        }

        catch (InputMismatchException e) {
            System.out.println("No se puede introducir una letras o símbolos.");
        }
         */

}
