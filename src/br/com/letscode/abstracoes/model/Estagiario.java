package br.com.letscode.abstracoes.model;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return 0;
    }

}
