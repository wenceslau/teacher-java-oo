package br.com.letscode.abs.model;

public class Supervisor extends Funcionario {

    @Override
    public double calculaBonus() {
        return getSalario() * 0.10;
    }
}
