import java.util.ArrayList;

public class Alumnos {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    public void agregar(Alumno alu) {
        listaAlumnos.add(alu);
    }

    public Alumno obtener(int num) {
        if (num >= 0 && num < listaAlumnos.size()) {
            return listaAlumnos.get(num);
        }
        return null;
    }

    public float getMedia() {
        if (listaAlumnos.size() == 0) {
            return 0;
        } else {
            float media = 0;
            for (Alumno alumno : listaAlumnos) {
                media += alumno.getNota();
            }
            return media / listaAlumnos.size();
        }
    }
}