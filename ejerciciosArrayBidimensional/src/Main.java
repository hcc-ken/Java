import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        int[][] num = new int [5] [8];
//        Random rand = new Random ();
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = rand.nextInt(50);
//                System.out.print(num[i][j] + " ");
//            }
//            System.out.println();}
        int [][] alumno;
        int notas = 0, min = 0, max = 0, media = 0, acumulador = 0;
        alumno = new int [5][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Introduzca su nota, alumno " + (i+1));
            for (int j = 0; j < alumno.length; j++) {
                System.out.println("Asinatura: " + (j+1));
                notas = sc.nextInt();
            }
        }

        for (int i = 0; i < alumno.length; i++) {
            for (int j = 0; j < alumno.length; j++) {
                acumulador += notas;
                media = acumulador / 5;
                if (notas>min) {

                }
            }

            System.out.println("Media: " + media);
        }
    }
}