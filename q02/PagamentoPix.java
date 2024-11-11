package q02;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean processarPagamento(Produto produto) {
        System.out.println("Pagamento de $" + produto.calcularDesconto() + " por PIX efetuado.");
        return true;
    }
}
