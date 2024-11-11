package q01;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int id;
    private String nome;
    private List<Curso> cursosMinistrados = new ArrayList<>();

    public Professor(int id, String nome, List<Curso> cursosMinistrados) {
        this.id = id;
        this.nome = nome;
        this.cursosMinistrados = cursosMinistrados;
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

    public List<Curso> getCursosMinistrados() {
        return this.cursosMinistrados;
    }

    public void setCursosMinistrados(List<Curso> cursosMinistrados) {
        this.cursosMinistrados = cursosMinistrados;
    }

    public boolean associarACurso(Curso curso) {
        for (Curso cursoMinistrado : this.cursosMinistrados) {
            if (cursoMinistrado.getId() == curso.getId()) {
                return false;
            }
        }
        this.cursosMinistrados.add(curso);
        return true;
    }

}
