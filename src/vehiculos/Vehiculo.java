package vehiculos;

public class Vehiculo {
    // 1. Propiedades protected
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected void mostrarDatos() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}