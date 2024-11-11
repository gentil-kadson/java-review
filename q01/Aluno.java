package q01;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private List<Curso> cursosMatriculados = new ArrayList<>();

    public Aluno(int id, String nome, List<Curso> cursosMatriculados) {
        this.id = id;
        this.nome = nome;
        this.cursosMatriculados = cursosMatriculados;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursosMatriculados() {
        return this.cursosMatriculados;
    }

    public void setCursosMatriculados(List<Curso> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    public boolean matricularEmCurso(Curso curso) {
        for (Curso cursoMatriculado : this.cursosMatriculados) {
            if (cursoMatriculado.getId() == curso.getId()) {
                return false;
            }
        }
        this.cursosMatriculados.add(curso);
        return true;
    }
}
