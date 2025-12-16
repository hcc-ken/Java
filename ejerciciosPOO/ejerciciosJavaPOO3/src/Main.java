import java.util.Scanner;

public class Main {
    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca el valor de x1.");
//        int x1 = sc.nextInt();
//        System.out.println("Introduzca el valor de y1.");
//        int y1 = sc.nextInt();
//        System.out.println("Introduzca el valor de x2.");
//        int x2 = sc.nextInt();
//        System.out.println("Introduzca el valor de y2.");
//        int y2 = sc.nextInt();
//
//        Rectangulo r1 = new Rectangulo(x1, y1, x2, y2);

        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(7, 9, 2 , 3);

        r1.imprimir();
        r2.imprimir();

        r1.setAll(4, 4, 8, 8);

        r1.imprimir();


    }
}