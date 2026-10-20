package Series;

public class Main {
    public static void main(String[] args) {
        Serie [] series = new Serie[5];
        Videojuegos [] videojuegos = new Videojuegos[5];

        series[0] = new Serie();
        series[1] = new Serie("Breaking Bad", "Vince Gilligan");
        series[2] = new Serie("Dark", 3, "Thriller", "Baran bo Odar");
        series[3] = new Serie("Black Mirror", 6, "Sci-Fi", "Charlie Brooker");
        series[4] = new Serie("The Last of Us", 2, "Drama", "Craig Mazin");

        videojuegos[0] = new Videojuegos();
        videojuegos[1] = new Videojuegos("Hollow Knight", 40);
        videojuegos[2] = new Videojuegos("Elden Ring", 80, "RPG", "FromSoftware");
        videojuegos[3] = new Videojuegos("Celeste", 10, "Plataformas", "Maddy Thorson");
        videojuegos[4] = new Videojuegos("The Witcher 3", 120, "RPG", "CD Projekt Red");

        series[1].entregar();
        series[2].entregar();

        videojuegos[2].entregar();
        videojuegos[3].entregar();


        int contadorSerie = 0;
        int contadorVideojuegos = 0;

        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                contadorSerie++;
                series[i].devolver();
            }

            if (videojuegos[i].isEntregado()) {
                contadorVideojuegos++;
                videojuegos[i].devolver();
            }
        }

        System.out.printf("Hay " + contadorSerie + " series entregados y " +  contadorVideojuegos + " videosjuegos entregados");


        Serie serieMasLarga = series [0];
        for (int i = 1; i < series.length; i++) {
            int resultadoComparacion = serieMasLarga.compareTo(series[i]);
            if (resultadoComparacion < 0) {
                serieMasLarga = series[i];
            }
        }
    }
}
