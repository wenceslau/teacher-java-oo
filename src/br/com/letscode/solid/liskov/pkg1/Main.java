package br.com.letscode.solid.liskov.pkg1;

public class Main {

    public static void main(String[] args) {

        PromocaoService promocaoService = new PromocaoService();

        Funcionario funcionario = new Funcionario("Ana", Cargo.VENDEDOR);
        promocaoService.efetivarPromocao(funcionario);

        Funcionario terceirizado = new Terceirizado("Jonh", Cargo.VENDEDOR);
        promocaoService.efetivarPromocao(terceirizado);

    }

}
