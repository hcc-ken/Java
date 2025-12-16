public class Principal {
    public static void main (String[] args){
        Punto p1, p2, p3;
        p1 = new Punto(5, 0);                                       //* ésto es una llamada al contructor "clase" "nombre" = new "clase" o directamente "nombre" = new "clase"
        p2 = new Punto(10, 10);                                     //* siempre que se hace un "x" "y" = new "x" estamos llamando al constructor.
        p3 = new Punto(-3,7);

//        System.out.println("Coordenadas de p1: X " + p1.getX() + " Y " + p1.getY());
//        System.out.println("Coordenadas de p2: X " + p2.getX() + " Y " + p2.getY());
//        System.out.println("Coordenadas de p3: X " + p3.getX() + " Y " + p3.getY());
//
//        //* El ejercicio pide que se sume o se reste a las coordenadas.
//
//        p1.setX(7); //* Dará error si en setter no tiene parámentros.
//        p1.setY(9);
//        System.out.println("Coordenadas de p1: X " + p1.getX() + " Y " + p1.getY());
//
//        p2.setX(p2.getX() + 3);
//        p2.setY(p2.getY() + 3);
//        System.out.println("Coordenadas de p2: X " + p2.getX() + " Y " + p2.getY());
//
//        //* Ahora que p3, sea la suma de p1 + p2
//        p3.setX(p1.getX() + p2.getX());
//        p3.setY(p1.getY() + p2.getY());
//        System.out.println("Coordenadas de p3: X " + p3.getX() + " Y " + p3.getY());

        p1.setXY(2, 5);
        p1.imprime();
        p1.desplaza(10, 10);
        p1.imprime();
    }


}