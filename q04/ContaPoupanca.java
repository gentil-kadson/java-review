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
}
