public class Libro {
    String titulo;
    int paginas;
    String autor;
    String editorial;
    String isbn;
    String categoria;
    String color;
//constructores
    public Libro() {
    }

    public Libro(String titulo, int paginas, String autor, String editorial, String isbn, String categoria, String color) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.categoria = categoria;
        this.color = color;
    }
//métodos
    void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Paginas: " + paginas);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("ISBN: " + isbn);
        System.out.println("Categoria: " + categoria);
        System.out.println("Color: " + color);

    }

}
