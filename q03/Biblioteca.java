package q03;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> {
    private List<T> publicacoes = new ArrayList<T>();

    public List<T> getPublicacoes() {
        return this.publicacoes;
    }

    public void setPublicacoes(List<T> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public void adicionarPublicacao(T publicacao) {
        publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao) {
        publicacoes.remove(publicacao);
    }
}
