public class Videojuego {
    String titulo;
    String plataforma;
    double precio;

    // Constructor explícito parametrizado
    public Videojuego(String titulo, String plataforma, double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public static void main(String[] args) {
        // Instanciación invocando al constructor parametrizado
        Videojuego juego1 = new Videojuego("Genshin Impact Starter Pack", "PC", 12000.00);
        Videojuego juego2 = new Videojuego("Honkai: Star Rail Bundle", "PlayStation 5", 25000.00);
        Videojuego juego3 = new Videojuego("Zenless Zone Zero Edition", "PC", 32000.00);

        // Impresión utilizando String.format()
        System.out.println(String.format("Videojuego 1: %s | Plataforma: %s | Precio: $%.2f", juego1.titulo, juego1.plataforma, juego1.precio));
        System.out.println(String.format("Videojuego 2: %s | Plataforma: %s | Precio: $%.2f", juego2.titulo, juego2.plataforma, juego2.precio));
        System.out.println(String.format("Videojuego 3: %s | Plataforma: %s | Precio: $%.2f", juego3.titulo, juego3.plataforma, juego3.precio));
    }
}