package br.com.letscode.abstracoes.model;

public class CalculaProventos {

    public double calcular(Funcionario funcionario){
        return funcionario.getSalario() + funcionario.calculaBonus();
    }

}
