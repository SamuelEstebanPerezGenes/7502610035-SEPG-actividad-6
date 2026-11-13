package pruebas;

import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Carro", "Toyota");
        Moto m = new Moto("Moto", "Yamaha", 250);

        m.mostrarInformacion(); // método público de Moto

        // --- Descomenta una por una para ver los errores de compilación ---
        // System.out.println(v.tipo);   // Error: 'tipo' has protected access in 'vehiculos.Vehiculo'
        // System.out.println(m.marca);  // Error: 'marca' has protected access in 'vehiculos.Vehiculo'
        // v.mostrarDatos();             // Error: 'mostrarDatos()' has protected access in 'vehiculos.Vehiculo'
    }
}