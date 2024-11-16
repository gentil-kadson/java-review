package q02;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean processarPagamento(Produto produto, float valor) {
        if (produto.calcularDesconto() == valor) {
            System.out.println("Pagamento de R$" + valor + " por PIX efetuado.");
            return true;
        }
        System.out.println("Pagamento nao efetuado, valor incorreto.");
        return false;
    }
}
