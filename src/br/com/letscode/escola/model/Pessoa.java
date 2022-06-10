package br.com.letscode.escola.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String nome;
    private LocalDate nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    protected long calculaIdade(){
        if (nascimento != null) {
            return ChronoUnit.YEARS.between(nascimento, LocalDate.now());
        }
        return 0;
    }

    public long retornaIdade(){
        return  calculaIdade();
    }
}
