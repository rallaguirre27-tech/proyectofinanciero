package unsch;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public double obtenerSaldo() {
        return saldo;
    }
    // Corrección: El documento tenía un error de sintaxis ("saldo monto;"). Se corrigió a "saldo -= monto;".
    public void retirar (double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        }
    }
}

