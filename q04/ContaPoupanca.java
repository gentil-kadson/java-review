package q04;

public class ContaPoupanca extends Conta {
    private double limiteDeSaque;

    public ContaPoupanca(String numeroConta, String titular, double saldo, double limiteDeSaque) {
        super(numeroConta, titular, saldo);
        this.limiteDeSaque = limiteDeSaque;
    }

    public double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    @Override
    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor > this.limiteDeSaque) {
            throw new ValorInvalidoException("O valor a ser sacado nao pode ser maior que o limite de saque.");
        }
        if (valor < 0) {
            throw new ValorInvalidoException("Valores negativos nao sao permitidos.");
        }
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("O seu saldo e menor do que o valor que voce quer sacar.");
        }
        this.saldo -= valor;
    }
}
