package Entidades;

public class Author {
    private String name;
    private String nationality;

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
}