public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void MostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
