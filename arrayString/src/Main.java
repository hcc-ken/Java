import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su numero de telefono con prefijo.");
        String phoneNumber = sc.nextLine();

        String [] phoneNumberParts = phoneNumber.split(" ");
//          // Version A
//        System.out.println("Escriba una frase.");
//        String greeting = sc.nextLine();
//
//        String [] greetings = greeting.split(" ");
//        System.out.println(greetings.length);
//
//        for (int i = 0; i < greetings.length; i++) {
//            if (greetings[i] != " ") {
//                System.out.print(greetings[i] + " ");
//            }
//
//        }
//
//         // Version B
//        System.out.println("Escriba otra frase.");
//        String greeting = sc.nextLine();
//
//        int contador = 1;
//        for (int i = 0; i < greeting.length(); i++) {
//            if (greeting.charAt(i) == ' ') {
//                contador++;
//            }
//        }
//        System.out.println(contador);
    }
}