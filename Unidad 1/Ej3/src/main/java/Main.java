import Entidades.*;
import Enum.*;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor 1", "pais 1");
        Autor autor2 = new Autor("Autor 2", "pais 2");

        Pintura pintura1 = new Pintura("pintura 1", autor1, TipoPintura.Oleo, "Lienzo");
        Escultura escultura1 = new Escultura("escultura 1", autor2, Materiales.Bronce, Estilos.Neoclasico);

        Sala sala1 = new Sala("sala 1");
        sala1.addObra(pintura1);
        sala1.addObra(escultura1);

        Museo museo = new Museo("museo 1", "d1", "Madrid", "España");
        museo.addSala(sala1);

        museo.mostrarDetallesMuseo();
    }
}
