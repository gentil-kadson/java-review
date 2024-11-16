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

}
