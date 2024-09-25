package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nombre;
    private List<Obra> obras;

    public Sala(String nombre) {
        this.nombre = nombre;
        this.obras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void addObra(Obra obra) {
        obras.add(obra);
    }

    public List<Obra> getObras() {
        return obras;
    }
}
