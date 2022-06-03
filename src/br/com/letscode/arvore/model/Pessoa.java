package br.com.letscode.arvore.model;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void imprimeAncestrais(){
        System.out.println("NOME: " + this.getNome());
        System.out.println("PAI: " + this.getPai());
        System.out.println("MÃE: " + this.getMae());
        System.out.println();
        if (this.getPai() != null) {
            this.getPai().imprimeAncestrais();
        }
        if (this.getMae() != null) {
            this.getMae().imprimeAncestrais();
        }
    }

    @Override
    public String toString() {
        return nome;
    }


}
