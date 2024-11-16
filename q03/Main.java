package q03;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Frankenstein", "Mary Shelly", 1818);
        Livro livro2 = new Livro("Dracula", "Bram Stoker", 1897);

        Revista revista1 = new Revista("Science", "Heisenberg", 2006);
        Revista revista2 = new Revista("Philosophy", "Friedrich Nietzsche", 1950);

        Biblioteca<Publicacao> nibelheim = new Biblioteca<>();
        nibelheim.adicionarPublicacao(livro1);
        nibelheim.adicionarPublicacao(revista2);
        nibelheim.adicionarPublicacao(revista1);
        nibelheim.adicionarPublicacao(livro2);

        nibelheim.removerPublicacao(revista2);
        nibelheim.removerPublicacao(livro2);

        nibelheim.listarPublicacoes();

    }
}
