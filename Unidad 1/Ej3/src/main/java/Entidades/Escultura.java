package Entidades;
import Enum.*;

public class Escultura extends Obra{
    public Materiales material;
    public Estilos estilo;

    public Escultura(String titulo, Autor autor, Materiales material, Estilos estilo) {
        super(titulo, autor);
        this.material = material;
        this.estilo = estilo;
    }

    public Materiales getMaterial() {
        return material;
    }

    public Estilos getEstilo() {
        return estilo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Escultura: " + titulo + " de " + autor.getNombre());
        System.out.println("Material: " + material);
        System.out.println("Estilo: " + estilo);
    }
}
