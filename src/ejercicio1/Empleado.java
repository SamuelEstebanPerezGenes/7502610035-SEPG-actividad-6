package ejercicio1;

public class Empleado {
    // 1. Propiedades protected
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", Salario: " + salario);
    }
}