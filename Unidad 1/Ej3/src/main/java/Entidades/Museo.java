package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Museo {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private List<Sala> salas;

    public Museo(String nombre, String direccion, String ciudad, String pais) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.salas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void mostrarDetallesMuseo() {
        System.out.println("Museo: " + nombre + " ubicado en " + ciudad + ", " + pais);
        for (Sala sala : salas) {
            System.out.println("\nSala: " + sala.getNombre());
            for (Obra obra : sala.getObras()) {
                obra.mostrarDetalles();
            }
        }
    }
}
