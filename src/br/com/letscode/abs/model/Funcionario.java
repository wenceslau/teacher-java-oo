package br.com.letscode.abs.model;

public abstract class Funcionario implements Bonus {

    private String nome;
    private double salario;

    private String senha = "";

    public abstract double calculaBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarAcesso(String senha){
        if (this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
}
