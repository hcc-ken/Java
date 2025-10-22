public class ejerciciosJava3 {
    public static void imprimeHolaMundo() {
        System.out.println("Hola");
    }

    public static int doble(int a) {
        int results = a * 2;
        return results;
    }

    public static int multplicar(int a, int b) {
        int results = a * b;
        return results;
    }

    public static double max(double value1, double value2) {
        double max;
        if (value1 > value2)
            max = value1;
        else
            max = value2;
        return max;
    }

    static void main(String[] args) {
        imprimeHolaMundo();

        int a = doble (10);
        int b = multplicar(3, 5);

        int c = doble (a);
        int d = multplicar(a,b);

        int e = doble (4) + multiplicar (2, 10);
    }
}
