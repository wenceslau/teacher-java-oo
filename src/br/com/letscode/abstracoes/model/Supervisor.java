package br.com.letscode.abstracoes.model;

public class Supervisor extends Funcionario implements Autenticavel {

    private String senha;
    public Supervisor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calculaBonus() {
        return getSalario() * 0.12;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean validarAcesso(String senha) {
        if (this.senha.equals(senha)){
            return true;
        }
        return false;
    }
}
