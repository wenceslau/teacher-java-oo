package br.com.letscode.solid.liskov.pkg2;

public class Terceirizado {

    private String nome;
    private Cargo cargo;

    public Terceirizado(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
