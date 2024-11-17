package q04;

public interface Transacao {
    public void sacar(double valor) throws ValorInvalidoException, SaldoInsuficienteException;

    public void depositar(double valor) throws ValorInvalidoException;
}
