package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private String name;
    private List<Artwork> artworks;

    public Gallery(String name) {
        this.name = name;
        this.artworks = new ArrayList<>();
    }

    public Gallery() {
    }

    public String getName() {
        return name;
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }
}
