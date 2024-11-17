package q04;

public class Conta implements Transacao {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorInvalidoException("Valores negativos nao sao permitidos.");
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return;
        }
        throw new SaldoInsuficienteException("Saldo insuficiente.");
    }

    @Override
    public void depositar(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException("Valores negativos nao sao permitidos.");
        }
        this.saldo += valor;
    }

}
