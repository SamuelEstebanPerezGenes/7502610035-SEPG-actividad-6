package vehiculos;

public class Moto extends Vehiculo {
    // 2. Propiedad adicional
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        // La subclase sí accede a lo protected
        mostrarDatos();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}