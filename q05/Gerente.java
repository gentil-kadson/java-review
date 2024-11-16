package q05;

public class Gerente extends Funcionario implements Bonus {
    public Gerente(int id, String nome, double salarioBase) {
        super(id, nome, salarioBase);
    }

    @Override
    public double calcularBonus(double percentual) {
        return this.salarioBase * percentual;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.calcularBonus(0.1);
    }
}
