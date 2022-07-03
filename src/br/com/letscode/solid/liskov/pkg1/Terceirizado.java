package br.com.letscode.solid.liskov.pkg1;

public class Terceirizado extends Funcionario {

    public Terceirizado(String nome, Cargo cargo) {
        super(nome, cargo);
    }

    @Override
    public void promover() {
        throw new RuntimeException("Erro, terceirizados não podem ser promovidos");
    }
}
