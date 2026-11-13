package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado("Laura", 3000000);
        Gerente g = new Gerente("Carlos", 8000000, "Ventas");

        e.mostrarInformacion();
        g.mostrarInformacion();

        // Polimorfismo: variable de tipo Empleado, objeto Gerente
        Empleado e2 = new Gerente("Marta", 9000000, "Finanzas");
        e2.mostrarInformacion();
    }
}