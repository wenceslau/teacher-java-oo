package br.com.letscode.aula;

import java.time.LocalDate;

public class Pessoa implements Comparable {

    private int matricula;
    private String nome;

    private LocalDate nascimento;

    public Pessoa(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nascimento + "";
    }

    @Override
    public int compareTo(Object o) {
        Pessoa pessoa = (Pessoa) o;
        return this.nascimento.compareTo(pessoa.nascimento);
    }
}
