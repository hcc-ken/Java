package Series;

public class Serie implements Entregable{
    String titulo;
    int num_temporada;
    boolean entregado;
    String genero;
    String creador;

    public Serie () {
        titulo = "";
        num_temporada = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie (String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;

    }

    public Serie(String titulo, int num_temporada, String genero, String creador) {
        this();
        this.titulo = titulo;
        this.num_temporada = num_temporada;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_temporada() {
        return num_temporada;
    }

    public void setNum_temporada(int num_temporada) {
        this.num_temporada = num_temporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString () {
        return "Titulo: " + titulo + "\n Numero de tempradas: " + num_temporada + "\n Genero: " + genero + "\n Creador: " + creador;
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
        Serie b = (Serie) a;
        return this.num_temporada - b.getNum_temporada();
    }
}
