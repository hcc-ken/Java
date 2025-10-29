import java.util.Scanner;

public class ejerciciosJava3 {

    public static int mult (int n){
        
    }

    public static void main(String[] args) {
        int circunferencia;
        
        Scanner sc = new Scanner(System.in);
        
    }
}



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
