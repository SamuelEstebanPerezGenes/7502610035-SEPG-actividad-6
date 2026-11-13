package ejercicio1;

public class Gerente extends Empleado {
    // 2. Propiedad adicional
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    // 3. Sobrescribe mostrarInformacion
    @Override
    public void mostrarInformacion() {
        // Accede directamente a nombre y salario porque son protected
        System.out.println("Gerente: " + nombre + ", Salario: " + salario
                + ", Departamento: " + departamento);
    }
}