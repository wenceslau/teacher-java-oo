package br.com.letscode.aula1;

public class Aluno {

    private String nome;
    private TipoAluna tipoAluno;


    public Aluno(String nome, TipoAluna tipoAluno) {
        this.nome = nome;
        this.tipoAluno = tipoAluno;
    }

    public String getNome() {
        return nome;
    }

    public TipoAluna getTipoAluno() {
        return tipoAluno;
    }
}
