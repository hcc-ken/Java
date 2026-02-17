import java.util.Scanner;

public class Main {
    public static void codifica(String mensaje) {
        char letra;
        String respuesta = "";

        for (int i = 0; i < mensaje.length(); i++) {
            letra = mensaje.charAt(i);

            if (letra == ' ') {
                respuesta += '#';
            }
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                if (letra == 'a') {
                    respuesta += 'e';
                } else if (letra == 'e') {
                    respuesta += 'i';
                } else if (letra == 'i') {
                    respuesta += 'o';
                } else if (letra == 'o') {
                    respuesta += 'u';
                } else if (letra == 'u') {
                    respuesta += 'a';
                }
            } else {
                if (letra == 'z') {
                    respuesta += 'a';
                } else {
                    char auxiliar = (char) (letra + 1);
                    respuesta += auxiliar;
                }
            }

            if (letra == '0') {
                respuesta += 'O';
            }
        }
        System.out.println(respuesta.toString());
    }
    public static void main (String [] args) {
        String mensaje;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el mensaje");
        mensaje = sc.nextLine().toLowerCase();

        codifica(mensaje);

//    public static double media (int num [][]) {
//        int media = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                media += num[i][j];
//            }
//        }
//
//        media = media / num.length;
//
//        return media;
//    }
//
//    public static int diagonalDescendente (int num[][]) {
//        int suma = 0;
//        for (int i = 0; i < num.length; i++) {
//            suma += num [i][i];
//        }
//
//        return suma;
//    }
//
//    public static int diagonalAscendente (int num [][]) {
//        int suma = 0;
//        for (int i = 0; i < num.length; i++) {
//            suma += num[i][num.length - 1 - i];
//        }
//
//        return suma;
//    }
//
//    public static int diagonalSuperior (int num [][]) {
//        int suma = 0;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (i < j) {
//                    suma += num[i][j];
//                }
//            }
//        }
//        return suma;
//    }
//
//    public static int diagonalInferior (int num [][]) {
//        int suma = 0;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (i > j) {
//                    suma += num[i][j];
//                }
//            }
//        }
//        return suma;
//    }
//
     // Ejercicio 1
//    public static void main (String [] args) {
//        TarjetaTransporte tarjeta1 = new TarjetaTransporte("ABC123", "José Niños Santos", 5);
//        TarjetaTransporte tarjeta2 = new TarjetaTransporte("ABC124", "María sabrina Dulce", 5);
//
//        tarjeta1.iniciaViaje();
//        tarjeta1.iniciaViaje();
//        tarjeta1.iniciaViaje();
//        tarjeta1.iniciaViaje();
//
//        tarjeta1.recargaTarjeta(10);
//
//        tarjeta2.iniciaViaje();
//        tarjeta2.iniciaViaje();
//        tarjeta2.iniciaViaje();
//
//        tarjeta2.recargaTarjeta(20);

        // Ejercicio 2
//        int contador = 0;
//        int max = 5;
//        int min = 5001;
//        int numero = 0;
//        int [] num = new int[100];
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < num.length; i++) {
//            numero = random.nextInt(5, 5001);
//            num [i] = numero;
//
//            if (numero > max) {
//                max = numero;
//            }
//
//            if (numero < min) {
//                min = numero;
//            }
//
//            if (numero % 2 != 0) {
//                contador++;
//            }
//        }
//
//        System.out.println("El numero maximo es: " + max);
//        System.out.println("El numero mínimo es:" + min);
//        System.out.println("Los numeros impares con: " + contador);

    // Ejercicio 3
//        int [][] num = new int [300][300];
//        Random random = new Random();
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num [i][j] = random.nextInt(100);
//            }
//        }
//
//        double media = media(num);
//        int diagonalDescendente = diagonalDescendente(num);
//        int diagonalAscendente = diagonalAscendente(num);
//        int diagonalSuperior = diagonalSuperior(num);
//        int diagonalInferior = diagonalInferior(num);
//
//
//        System.out.println("Media: " + media);
//        System.out.println("Suma en diagonal descendente: " + diagonalDescendente);
//        System.out.println("Suma en diagonal ascendente: " + diagonalAscendente);
//        System.out.println("Suma superior diagonal: " + diagonalSuperior);
//        System.out.println("Suma inferior diagonal: " + diagonalInferior);
//    }
        // Ejercicio 4
//        Random random = new Random();
//        ArrayList <Integer> numeros = new ArrayList<Integer>();
//        int num = 0;
//
//        do {
//            num = random.nextInt(101);
//
//            if (num % 2 == 0) {
//                numeros.add(num);
//            } else {
//                numeros.add(0, num);
//            }
//        } while (num != 50);
//
//        System.out.println(numeros);
    }
}