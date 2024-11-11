package q02;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean processarPagamento(Produto produto) {
        System.out.println("Pagamento de $" + produto.calcularDesconto() + " por cartao efetivado.");
        return true;
    }
}
