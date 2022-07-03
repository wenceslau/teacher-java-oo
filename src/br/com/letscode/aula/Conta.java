package br.com.letscode.aula;

public class Conta {

    private double saldo;

    public boolean depositar(double valor){
        saldo += valor;
        // Atualizar esse saldo no banco de dados
        return true;
    }

    public boolean sacar(double valor){
        saldo -= valor;
        // Atualizar esse saldo no banco de dados
        return true;
    }

    public boolean debito(String barCode, double valor){
        System.out.println("Codigo Barra "+ barCode);
        saldo -=valor;
        // Atualizar esse saldo no banco de dados
        return true;
    }

}
