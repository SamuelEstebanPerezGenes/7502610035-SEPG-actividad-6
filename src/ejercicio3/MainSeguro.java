package ejercicio3;

public class MainSeguro {
    public static void main(String[] args) {
        Banco banco = new Banco(1000);

        banco.depositar(500);
        System.out.println("Saldo tras depositar 500: " + banco.getSaldo());

        banco.retirar(2000); // rechazado: fondos insuficientes
        System.out.println("Saldo tras intentar retirar 2000: " + banco.getSaldo());

        banco.retirar(300);
        System.out.println("Saldo tras retirar 300: " + banco.getSaldo());

        // --- Descomenta para ver el error de compilación ---
        // banco.saldo = -500; // Error: 'saldo' has private access in 'Banco'
    }
}