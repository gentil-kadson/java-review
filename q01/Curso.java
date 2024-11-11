package q01;

import java.util.List;

public class Curso {
    private int id;
    private String nome;
    private int duracaoHoras;

    public static void getAlunosMatriculadosEmCurso(Curso curso, List<Aluno> alunos) {
        System.out.println("Alunos matriculados no curso " + curso.getNome() + ":");
        for (Aluno aluno : alunos) {
            if (aluno.getCursosMatriculados().contains(curso)) {
                System.out.println("- " + aluno.getNome());
            }
        }

    }

    public static void getCursosMinistradosPeloProfessor(Professor professor) {
        System.out.println("Cursos que " + professor.getNome() + " leciona:");
        for (Curso curso : professor.getCursosMinistrados()) {
            System.out.println("- " + curso.getNome());
        }
    }

    public Curso(int id, String nome, int duracaoHoras) {
        this.id = id;
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

}