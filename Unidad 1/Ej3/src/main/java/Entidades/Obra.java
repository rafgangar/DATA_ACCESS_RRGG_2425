package Entidades;

public abstract class Obra {
    protected String titulo;
    protected Autor autor;

    public Obra(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public abstract void mostrarDetalles();
}