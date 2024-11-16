package q05;

import java.util.ArrayList;
import java.util.List;

public class Empresa<T extends Funcionario> {
    private List<T> funcionarios = new ArrayList<T>();

    public void adicionarFuncionario(T funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(T funcionario) {
        if (this.funcionarios.contains(funcionario)) {
            this.funcionarios.remove(funcionario);
            System.out.println("Funcionario " + funcionario.nome + " removido.");
            return;
        }
        System.out.println("Funcionario nao encontrado na base de dados.");
    }

    public void listarFuncionarios() {
        System.out.println("Funcionarios da empresa:");
        for (T funcionario : this.funcionarios) {
            System.out.println("- " + funcionario.nome + ": R$" + funcionario.calcularSalario());
        }
    }
}
