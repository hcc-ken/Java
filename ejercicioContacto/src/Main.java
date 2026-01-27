import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static int menu () {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Agregar contacto");
        System.out.println("2. Modificar contactos");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Consultar contactos");
        System.out.println("5. Listar todos los contactos");
        System.out.println("6. Ordenar contactos por nombre");
        System.out.println("7. Salir");
        n = sc.nextInt();

        return n;
    }
    
    public static void agregarContacto(ArrayList <Contacto> agenda) {
        String nombre;
        String apellidos;
        int telefono;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese los apellidos:");
        apellidos = sc.nextLine();
        System.out.println("Ingrese el telefono:");
        telefono = sc.nextInt();
        Contacto nuevoContacto = new Contacto (nombre, apellidos, telefono);
        agenda.add(nuevoContacto);
    }

    public static void modificarContacto(ArrayList <Contacto> agenda) {
        int num;
        String nombre;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                String nombreTemporal = agenda.get(j).getNombre();
                if (nombreTemporal.compareTo(agenda.get(i).getNombre()) > 0) {
                    Contacto temp = agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, temp);
                }
            }
        }

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }

        System.out.println("Seleccione el numero del contacto que quiera modificar.");
        num = sc.nextInt();

        System.out.println("Ingrese el nuevo nombre:");
        nombre = sc.nextLine();
        agenda.get(num).setNombre(sc.nextLine());

        System.out.println("Ingrese los nuevos apellidos:");
        agenda.get(num).setApellidos(sc.nextLine());

        System.out.println("Ingrese el nuevo telefono:");
        agenda.get(num).setTelefono(sc.nextInt());
    }

    public static void eliminarContacto(ArrayList <Contacto> agenda) {
        int num;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                String nombreTemporal = agenda.get(j).getNombre();
                if (nombreTemporal.compareTo(agenda.get(i).getNombre()) > 0) {
                    Contacto temp = agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, temp);
                }
            }
        }

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }

        System.out.println("Seleccione el numero del contacto que quiera eliminar.");
        num = sc.nextInt();
        agenda.remove(num);
    }

    public static void consultarContacto(ArrayList <Contacto> agenda) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del contacto que desea consultar:");
        num = sc.nextInt();

        System.out.println(agenda.get(num));
    }

    public static void listarContactos(ArrayList <Contacto> agenda) {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }
    }

    public static void ordenarContactos(ArrayList <Contacto> agenda) {
        for (int i = 0; i < agenda.size(); i++) {
            for (int j = 0; j < agenda.size(); j++) {
                String nombreTemporal = agenda.get(j).getNombre();
                if (nombreTemporal.compareTo(agenda.get(i).getNombre()) > 0) {
                    Contacto temp = agenda.get(i);
                    agenda.set(i, agenda.get(j));
                    agenda.set(j, temp);
                }
            }
        }
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(i + " - " + agenda.get(i).getNombre() + " " + agenda.get(i).getApellidos() + " " + agenda.get(i).getTelefono());
        }
    }
    
    public static void main(String[] args) {
        int opcion;
        ArrayList <Contacto> agenda = new ArrayList<>();
        opcion = menu();

        while (opcion != 7) {

            switch (opcion) {
                case 1:
                    agregarContacto(agenda);
                    break;
                case 2:
                    modificarContacto(agenda);
                    break;
                case 3:
                    eliminarContacto(agenda);
                    break;
                case 4:
                    consultarContacto(agenda);
                    break;
                case 5:
                    listarContactos(agenda);
                    break;
                case 6:
                    ordenarContactos(agenda);
                    break;
            }
            opcion = menu();
        }
    }
}