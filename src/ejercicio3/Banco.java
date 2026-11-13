package ejercicio3;

public class Banco {
    // Solución: saldo privado
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}