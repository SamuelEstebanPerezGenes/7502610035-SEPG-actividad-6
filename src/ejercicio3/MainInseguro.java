package ejercicio3;

public class MainInseguro {
    public static void main(String[] args) {
        BancoInseguro b = new BancoInseguro(1000);
        b.saldo = -500; // Compila porque está en el mismo paquete
        System.out.println("Saldo corrupto: " + b.saldo);

        CuentaAhorro c = new CuentaAhorro(2000);
        c.manipular();
        System.out.println("Saldo manipulado por la subclase: " + c.verSaldo());
    }
}