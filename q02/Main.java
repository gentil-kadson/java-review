package q02;

public class Main {
    public static void main(String[] args) {
        Produto playstation = new Eletronico(1, "PlayStation 3 Slim", 700);
        Produto iphone = new Eletronico(1, "iPhone 13", 3500);
        Produto camisaInsider = new Vestuario(1, "Tech Shirt Cinza", 200);

        PagamentoCartao nubank = new PagamentoCartao();
        PagamentoPix caixa = new PagamentoPix();

        caixa.processarPagamento(playstation);
        nubank.processarPagamento(iphone);
        caixa.processarPagamento(camisaInsider);
    }
}
