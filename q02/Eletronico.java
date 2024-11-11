package q02;

public class Eletronico extends Produto {
    public Eletronico(int id, String nome, float preco) {
        super(id, nome, preco);
    }

    @Override
    public float calcularDesconto() {
        super.preco *= 0.9;
        return super.preco;
    }
}
