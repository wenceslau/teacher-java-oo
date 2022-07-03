package br.com.letscode.abs.model;

public class Programador extends Funcionario {

    @Override
    public double calculaBonus() {
        return getSalario() * 0.05;
    }
}
