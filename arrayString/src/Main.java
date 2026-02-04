import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje;
        char letra;

        System.out.println("Introduzca un mensaje.");
        mensaje = sc.nextLine().toUpperCase();

        for (int i = 0; i < mensaje.length(); i++) {
            letra = mensaje.charAt(i);

            if (letra == ' ') {
                System.out.print(' ');
            }
            else if (letra >= 'A' && letra <= 'Z') {
                letra++;
                if (letra > 'Z') {
                    letra = 'A';
                }
                System.out.print(letra);
            }
            else if (letra >= '0' && letra <= '9') {
                letra++;
                if (letra > '9') {
                    letra = '0';
                }
                System.out.print(letra);
            }
        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca su numero de telefono con prefijo.");
//        String numero = sc.nextLine();
//
//        String parte1 = numero.substring(0, 2); // Principio hasta el indice 2 (sin incluir el 2)
//        String parte2 = numero.substring(2, 3);
//        String parte3 = numero.substring(3); // Desde el indice 4 hasta el final
//
//        System.out.println("(" + parte1 + ")" + "-" + parte2 + "-" + parte3);


//        String [] phoneNumberParts = phoneNumber.split(" ");
//          // Ejercicio 1 Version A
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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escriba otra frase.");
//        String cadena = sc.nextLine();
//        String palabra = "";
//
//        int contador = 0;
//        for (int i = 0; i < cadena.length(); i++) {
//            if (cadena.charAt(i) == ' ') {
//                contador++;
//                System.out.println(palabra);
//            } else {
//                palabra = palabra + cadena.charAt(i);
//            }
//        }
//        System.out.println(palabra);
    }
}