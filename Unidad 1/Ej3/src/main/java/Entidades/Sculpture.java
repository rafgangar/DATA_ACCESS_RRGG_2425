package Entidades;
import Enum.*;
public class Sculpture extends Artwork {
    private MaterialsEnum material;
    private StylesEnum style;

    public Sculpture(String title, Author author, MaterialsEnum material, StylesEnum style) {
        this.title = title;
        this.author = author;
        this.material = material;
        this.style = style;
    }

    public Sculpture() {
    }

    public MaterialsEnum getMaterial() {
        return material;
    }

    public StylesEnum getStyle() {
        return style;
    }

    @Override
    public void showDetails() {
        System.out.println("Sculpture: " + title + " by " + author.getName());
        System.out.println("Material: " + material);
        System.out.println("Style: " + style);
    }
}
