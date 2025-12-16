import java.util.Scanner;

public class Principal {
    public static void main (String[] args) {
        Persona persona1, persona2;
        String dni, nombre, apellido;
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su DNI");
        dni = sc.nextLine();
        System.out.println("Introduzca su NOMBRE.");
        nombre = sc.nextLine();
        System.out.println("Introduzca su APELLIDO.");
        apellido = sc.nextLine();
        System.out.println("Introduzca su EDAD.");
        edad = sc.nextInt();
        sc.nextLine();

        persona1 = new Persona(dni, nombre, apellido, edad);

        System.out.println("Introduzca su DNI.");
        dni = sc.nextLine();
        System.out.println("Introduzca su NOMBRE.");
        nombre = sc.nextLine();
        System.out.println("Introduzca su APELLIDO.");
        apellido = sc.nextLine();
        System.out.println("Introduzca su EDAD.");
        edad = sc.nextInt();


        persona2 = new Persona(dni, nombre, apellido, edad);

//        System.out.print(persona1.getNombre() + " " + persona1.getApellido() + ". Con DNI: " + persona1.getDni() + " Edad: " + persona1.getEdad());
//        System.out.println(persona2.getNombre() + " " + persona2.getApellido() + ". Con DNI: " + persona2.getDni() + " Edad: " + persona2.getEdad());
//
//        if (persona1.getEdad() >= 18) {
//            System.out.println(" es mayor de edad.");
//        } else {
//            System.out.println( " no es mayor de edad.");
//        }
//      }

        persona1.imprime();
        if (persona1.mayorEdad())
            System.out.println("Es mayor de edad.");
        else
            System.out.println("Es menor de edad.");

        persona2.imprime();
        if (persona2.mayorEdad())
            System.out.println("Es mayor de edad.");
        else
            System.out.println("Es menor de edad.");



//        if (persona1.jubilado()) {
//            System.out.print("Usted es está jubilado.");
//        } else if (persona1.mayorEdad()) {
//            System.out.print("Usted es mayor de edad.");
//        } else {
//            System.out.print("Usted es menor.");
//        }
//
//        if (persona2.jubilado()) {
//            System.out.print("Usted es está jubilado.");
//        } else if (persona2.mayorEdad()) {
//            System.out.print("Usted es mayor de edad.");
//        } else {
//            System.out.print("Usted es menor.");
//        }
//
    }
}