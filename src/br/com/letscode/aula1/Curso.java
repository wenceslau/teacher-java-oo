package br.com.letscode.aula1;

public class Curso {

    private Aluno aluno;
    private TipoCurso tipoCurso;

    public Curso(Aluno aluno, TipoCurso tipoCurso) {
        this.aluno = aluno;
        this.tipoCurso = tipoCurso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }
}
