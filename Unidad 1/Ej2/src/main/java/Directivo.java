public class Directivo extends Empleado{
    private String categoria;

    public Directivo(String nombre, int edad, float sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para contar el número de subordinados
    public int Subordinados() {
        // Aquí debes implementar la lógica para contar subordinados
        return 0;
    }
}
