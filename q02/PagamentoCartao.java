package q02;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean processarPagamento(Produto produto, float valor) {
        if (produto.calcularDesconto() == valor) {
            System.out.println("Pagamento de R$" + valor + " por cartao efetivado.");
            return true;
        }
        System.out.println("Pagamento nao efetuado, valor incorreto");
        return false;
    }
}
