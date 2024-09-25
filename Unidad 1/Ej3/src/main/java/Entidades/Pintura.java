package Entidades;

import Enum.TipoPintura;

public class Pintura extends Obra {
    private TipoPintura tipo;
    private String formato;

    public Pintura(String titulo, Autor autor, TipoPintura tipo, String formato) {
        super(titulo, autor);
        this.tipo = tipo;
        this.formato = formato;
    }

    public TipoPintura getTipo() {
        return tipo;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Pintura: " + titulo + " de " + autor.getNombre());
        System.out.println("Tipo: " + tipo);
        System.out.println("Formato: " + formato);
    }
}