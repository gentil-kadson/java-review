package q05;

public class Main {
    public static void main(String[] args) {
        Analista kadso = new Analista(1, "Kadson", 2000);
        Analista lobo = new Analista(2, "Lobo Junior", 2500);
        Gerente bob = new Gerente(1, "Bob", 3000);
        Gerente ray = new Gerente(2, "Ray Leal", 5000);

        Empresa<Funcionario> europeias = new Empresa<>();
        europeias.adicionarFuncionario(ray);
        europeias.adicionarFuncionario(kadso);
        europeias.listarFuncionarios();

        europeias.adicionarFuncionario(bob);
        europeias.adicionarFuncionario(lobo);
        europeias.listarFuncionarios();

        europeias.removerFuncionario(new Analista(3, "Alyson", 1000));
        europeias.removerFuncionario(ray);
        europeias.removerFuncionario(kadso);
        europeias.listarFuncionarios();
    }
}
