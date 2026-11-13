package ejercicio3;

public class BancoInseguro {
    // Mala práctica: dato crítico como protected
    protected double saldo;

    public BancoInseguro(double saldo) {
        this.saldo = saldo;
    }
}