import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int NumClientes() {
        return clientes.size();
    }

    // Métodos para añadir empleados y clientes
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
