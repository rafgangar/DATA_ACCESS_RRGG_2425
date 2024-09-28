package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private String name;
    private String address;
    private String city;
    private String country;
    private List<Gallery> galleries;

    public Museum(String name, String address, String city, String country) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.galleries = new ArrayList<>();
    }

    public Museum() {
    }

    public String getName() {
        return name;
    }

    public void addGallery(Gallery gallery) {
        galleries.add(gallery);
    }

    public List<Gallery> getGalleries() {
        return galleries;
    }

    public void showMuseumDetails() {
        System.out.println("Museum: " + name + " located in " + city + ", " + country);
        for (Gallery gallery : galleries) {
            System.out.println("\nGallery: " + gallery.getName());
            for (Artwork artwork : gallery.getArtworks()) {
                artwork.showDetails();
            }
        }
    }
}


