public class Rectangulo {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangulo (int x1, int y1, int x2, int y2) {
        if (x2 > x1 && y2 > y1) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.out.println("Error al instanciar Rectangulo.");
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
        }
    }

    public int getX1 () {
        return x1;
    }

    public void setX1 (int x1) {
        if (x1 < x2) {
            this.x1 = x1;
        }
        else {
            System.out.println("Error.");
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
        }
    }

    public int getY1 () {
        return y1;
    }

    public void setY1 (int y1) {
        if (y1 < y2) {
            this.y1 = y1;
        }
        else {
            System.out.println("Error.");
            this.x1 = 0;
            this.y1 = 0;
            this.x2 = 0;
            this.y2 = 0;
        }
    }

    public int getX2 () {
        return x2;
    }

    public void setX2 (int x2) {
        if (x2 > x1) {
            this.x2 = x2;
        }
        else {
            System.out.println("Error.");
            valor0();                                               //* sustituyo las veces que tenga que escribir this.x1 ....
        }
    }

    public int getY2 () {
        return y2;
    }

    public void setY2 (int y2) {
        if (y2 > y1) {
            this.y2 = y2;
        }
        else {
            System.out.println("Error.");
            valor0();
        }
    }

    public void setX1Y1 (int x1, int y1) {
        setX1(x1);
        setY1(y1);
    }

    public void setX2Y2 (int x2, int y2) {
        setX2(x2);
        setY2(y2);
    }

    public void setAll (int x1, int y1, int x2, int y2) {
//        setX1(x1);        está bien, pero ya que tienes arriba x1y1 y x2y2, hazlo en uno.
//        setY1(y1);
//        setX2(x2);
//        setY2(y2);

        setX2Y2(x2, y2);
        setX1Y1(x1, y1);
    }

    public void imprimir () {
        System.out.println(" x1: " + x1 + " y1: " + y1);
        System.out.println(" x2: " + x2 + " y2: " + y2);
    }

    private void valor0 () {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    public int getPerimetro () {
        return (y2 - y1) * 2 + (x2 - x1) * 2;
    }

    public int getArea () {
        return (x2 - x1) * (y2 - y1);
    }
}
