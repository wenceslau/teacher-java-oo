package br.com.letscode.escola.model;

public class Aluno extends Pessoa {

    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
