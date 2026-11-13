package ejercicio3;

public class CuentaAhorro extends BancoInseguro {

    public CuentaAhorro(double saldo) {
        super(saldo);
    }

    public void manipular() {
        // Compila, pero la subclase modifica el saldo sin ninguna validación
        saldo = -999999;
    }

    public double verSaldo() {
        return saldo;
    }
}