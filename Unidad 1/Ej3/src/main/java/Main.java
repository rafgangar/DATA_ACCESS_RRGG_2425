import Entidades.*;
import Enum.*;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Rafa", "Spain");
        Author author2 = new Author("Rafa", "France");

        Painting painting1 = new Painting(
                "painting 1", author1, PaintingTypeEnum.Oil, "format");
        Sculpture sculpture1 = new Sculpture(
                "sculpture 1", author2, MaterialsEnum.Bronze, StylesEnum.Neoclassical);

        Gallery gallery1 = new Gallery("gallery 1");
        gallery1.addArtwork(painting1);
        gallery1.addArtwork(sculpture1);

        Museum museum = new Museum("museum 1", "s", "Madrid", "Spain");
        museum.addGallery(gallery1);

        museum.showMuseumDetails();
    }
}
