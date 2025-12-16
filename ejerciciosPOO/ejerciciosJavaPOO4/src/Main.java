import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Articulo art1, art2, art3, art4, art5;
        double pvp;
        int descuento;

        art1 = new Articulo("RAM", 499, 21, 100 );
        art2 = new Articulo("Intel", 545, 21, 69);
        art3 = new Articulo("Ventilador", 89.99, 21, 201);
        art4 = new Articulo("Caja", 70, 21, 103);
        art5 = new Articulo("Motherboard", 106, 21, 104);

//        pvp = art1.getPrecio() + art1.getPrecio() * art1.getIva();
//        System.out.println(art1.getNombre() + "Precio sin IVA: " + art1.getPrecio() + "Precio PVP:" + pvp + " Quedan: " + art1.getCuantosQuedan());

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuánta cantidad quiere.");
        int cantidad = sc.nextInt();

        boolean resultadoVenta = art1.vender(cantidad);

        if (resultadoVenta) {
            System.out.println("Venta efectuada");
        } else {
            System.out.println("No");
        }

        System.out.println("Cuánta cantidad quiere almacenar.");
        cantidad = sc.nextInt();

        art1.almacenar(cantidad);

        if (resultadoVenta) {
            System.out.println("Almacenamiento efectuada");
        } else {
            System.out.println("No se puede almacenar cantidades negativas o 0.");
        }

    }
}