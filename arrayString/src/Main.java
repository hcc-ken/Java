import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca su numero de telefono con prefijo.");
//        String phoneNumber = sc.nextLine();
//
//        String [] phoneNumberParts = phoneNumber.split(" ");
//          // Version A
//        System.out.println("Escriba una frase.");
//        String palabra = sc.nextLine();
//
//        String [] greetings = palabra.split(" ");
//        System.out.println(greetings.length);
//
//        for (int i = 0; i < greetings.length; i++) {
//            if (greetings[i] != " ") {
//                System.out.print(greetings[i] + " ");
//            }
//        }
//
//         // Version B
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba otra frase.");
        String cadena = sc.nextLine();
        String palabra = "";

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
                System.out.println(palabra);
                palabra = "";
            } else {
                palabra = palabra + cadena.charAt(i);
            }
        }
        System.out.println(palabra);
    }
}