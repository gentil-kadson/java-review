package q04;

public class Main {
    public static void main(String[] args) {
        ContaCorrente nubank = new ContaCorrente("12345", "Kadson", 6000, 10);
        ContaPoupanca caixa = new ContaPoupanca("67890", "Ray", 7500, 2000);

        try {
            nubank.sacar(6000);
        } catch (ValorInvalidoException e) {
            System.out.println(e);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }

        try {
            nubank.sacar(5000);
            System.out.println("Novo saldo Nubank: R$" + nubank.getSaldo());
            nubank.depositar(510);
            System.out.println("Novo saldo Nubank: R$" + nubank.getSaldo());
        } catch (ValorInvalidoException e) {
            System.out.println(e);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }

        try {
            caixa.sacar(1500);
            System.out.println("Novo saldo CAIXA: R$" + caixa.getSaldo());
            caixa.sacar(2200);
        } catch (ValorInvalidoException e) {
            System.out.println(e);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e);
        }

        System.out.println("Novo saldo CAIXA: R$" + caixa.getSaldo());
    }
}
