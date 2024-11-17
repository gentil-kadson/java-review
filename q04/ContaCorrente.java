package q04;

public class ContaCorrente extends Conta {
    private double taxaParaSaque;

    public ContaCorrente(String numeroConta, String titular, double saldo, double taxaParaSaque) {
        super(numeroConta, titular, saldo);
        this.taxaParaSaque = taxaParaSaque;
    }

    public double getTaxaParaSaque() {
        return taxaParaSaque;
    }

    public void setTaxaParaSaque(double taxaParaSaque) {
        this.taxaParaSaque = taxaParaSaque;
    }

    @Override
    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorInvalidoException("O valor a ser sacado nao pode ser negativo.");
        }
        if (valor + this.taxaParaSaque > this.saldo) {
            throw new SaldoInsuficienteException(
                    "O valor a ser sacado somado da taxa para saque e maior do que o seu saldo.");
        }
        this.saldo = this.saldo - (this.taxaParaSaque + valor);
    }

}
