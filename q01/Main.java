package q01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        List<Curso> cursos = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();

        Curso informatica = new Curso(1, "Informática", 450);
        Curso tads = new Curso(2, "TADS", 4500);
        Curso psicologia = new Curso(3, "Psicologia", 10000);
        cursos.add(informatica);
        cursos.add(tads);
        cursos.add(psicologia);

        Aluno kadson = new Aluno(1, "Gentil Kadson", new ArrayList<Curso>(Arrays.asList(informatica, psicologia)));
        Aluno lobo = new Aluno(2, "Lobo Júnior", new ArrayList<Curso>(Arrays.asList(tads, informatica)));
        Aluno damiao = new Aluno(3, "Damiao", new ArrayList<Curso>(Arrays.asList(psicologia, tads, informatica)));
        alunos.add(kadson);
        alunos.add(lobo);
        alunos.add(damiao);

        Professor raphael = new Professor(1, "Raphael Muniz", Arrays.asList(tads, psicologia));
        Professor thiago = new Professor(2, "Thiago Henrique", Arrays.asList(tads, informatica));
        Professor bonfim = new Professor(3, "Manoel do Bonfim", Arrays.asList(tads, informatica, psicologia));
        professores.add(raphael);
        professores.add(thiago);
        professores.add(bonfim);

        System.out.println(kadson.matricularEmCurso(psicologia));
        Curso.getAlunosMatriculadosEmCurso(psicologia, alunos);
        Curso.getCursosMinistradosPeloProfessor(thiago);

    }
}
