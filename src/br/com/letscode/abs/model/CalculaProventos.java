package br.com.letscode.abs.model;

public class CalculaProventos {

    private double proventos;

    public double calcular(Funcionario f){
        return f.getSalario() + f.calculaBonus();
    }


}
