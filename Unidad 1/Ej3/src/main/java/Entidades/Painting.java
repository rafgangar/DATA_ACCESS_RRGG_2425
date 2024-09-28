package Entidades;
import Enum.*;
public class Painting extends Artwork {
    private PaintingTypeEnum type;
    private String format;

    public Painting(String title, Author author, PaintingTypeEnum type, String format) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.format = format;
    }

    public Painting() {
    }


    public PaintingTypeEnum getType() {
        return type;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void showDetails() {
        System.out.println("Painting: " + title + " by " + author.getName());
        System.out.println("Type: " + type);
        System.out.println("Format: " + format);
    }
}