package q02;

public class Vestuario extends Produto {
    public Vestuario(int id, String nome, float preco) {
        super(id, nome, preco);
    }

    @Override
    public float calcularDesconto() {
        super.preco *= 0.8;
        return super.preco;
    }
}