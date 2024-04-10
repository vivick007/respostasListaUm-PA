public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String toString() {
        return "Conta: " + numeroConta + "\nSaldo: R$ " + saldo;
    }
    
}
