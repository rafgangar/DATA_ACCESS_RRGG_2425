class Alumno {
    private String nombre;
    private int nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        }
    }

    public boolean isAprobado() {
        return nota >= 5;
    }
}
