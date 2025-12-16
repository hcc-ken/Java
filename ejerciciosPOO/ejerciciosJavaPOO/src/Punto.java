public class Punto {                                        //* Hay que definir metodo y atributo.
    private int x;                                          //* Private SIEMPRE para evitar errores.
    private int y;                                          //* Lo que hay aquí dentro son atributos.

    public Punto (int x, int y){                            //* Ésto es un metodo constructor, tienen siempre el mismo nombre que la clase.
        this.x = x;                                         //* thix.x le da el valor al atributo, es decir al private int x que está arriba.
        this.y = y;                                         //* para saber si estamos llamando al constructor, siempre lleva el nombre de la clase, también carecen de retorno.
    }

    public int getX() { //* getters
        return x;                                           //* el get esta getting su valor del atributo.
    }

    public int getY() {
        return y;
    }

    public void setX(int x) { //* setters
        this.x = x;                                         //* los setters siempre serán void porque nunca hacen return, ya que solamente establece.
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprime () {
        System.out.println("p1: X " + x + " Y " + y);
    }

    public void setXY (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public  void desplaza (int dx, int dy) {
        setX(x + dx);
        setY(y + dy);
    }
}

