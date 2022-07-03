package br.com.letscode.abstracoes.model;

public class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return getSalario() * 0.15;
    }
}
