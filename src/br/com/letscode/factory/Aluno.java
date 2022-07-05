package br.com.letscode.factory;

import br.com.letscode.trabalho.contas.TipoConta;

import java.util.PrimitiveIterator;

public class Aluno {

    private String nome;

    private TipoAluno tipoAluno;

    public Aluno(String nome, TipoAluno tipoAluno) {
        this.nome = nome;
        this.tipoAluno = tipoAluno;
    }

    public String getNome() {
        return nome;
    }

    public TipoAluno getTipoAluno() {
        return tipoAluno;
    }
}
