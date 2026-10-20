package Series;

public class Videojuegos implements Entregable {
    String titulo;
    int horas_estimadas;
    boolean entregado;
    String genero;
    String compania;

    public Videojuegos () {
        titulo = "";
        horas_estimadas = 10;
        entregado = false;
        genero = "";
        compania = "";
    }

    public Videojuegos (String titulo, int horas_estimadas) {
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        entregado = false;
        genero = "";
        compania = "";
    }

    public Videojuegos (String titulo, int horas_estimadas, String genero, String compania) {
        this();
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString () {
        return "Titulo: " + titulo + "\n horas_estimadas: " + horas_estimadas + "\n Genero: " + genero + "\n Compañía: " + compania;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        Videojuegos b = (Videojuegos) a;
        return this.horas_estimadas - b.getHoras_estimadas();
    }
}
