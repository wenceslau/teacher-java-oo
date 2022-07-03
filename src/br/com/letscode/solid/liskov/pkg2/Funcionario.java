package br.com.letscode.solid.liskov.pkg2;

public class Funcionario implements FuncionarioPromovivel {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public void promover() {
        if(cargo.equals(br.com.letscode.solid.liskov.pkg1.Cargo.GERENTE)){
            System.out.println("O cargo gerente não é promovivel");
        }else if (cargo.equals(Cargo.VENDEDOR)){
            System.out.println("Promovido para Supervisor");
            cargo = Cargo.SUPERVISOR;
        }else if (cargo.equals(Cargo.SUPERVISOR)){
            System.out.println("Promovido para Gerente");
            cargo = Cargo.GERENTE;
        }
    }
}
