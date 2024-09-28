package Entidades;

public abstract class Artwork {
    protected String title;
    protected Author author;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public abstract void showDetails();
}