package br.com.letscode.conta.model;

import java.util.logging.Logger;

public class Conta {

    public static Logger logger = Logger.getLogger("Conta");

    public static double saldoDoBanco = 0;

    public static int id;

    private Titular titular;
    private int agencia;
    private double saldo;
    private int numero;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        id++;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        saldo += valor;
        saldoDoBanco += valor;
    }

    public boolean sacar(double valor) {
        if (temSaldo(valor)) {
            saldo -= valor;
            saldoDoBanco -= valor;
            return true;
        }
        return false;
    }

    public double retornarSaldo() {
        return saldo;
    }

    public boolean transferir(double valor, Conta contaDestino){
        if (temSaldo(valor)){
            sacar(valor);
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    private boolean temSaldo(double valor){
        if (saldo >= valor){
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public String retornaNomeTitular(){
        return titular.getNome();
    }

    @Override
    public String toString() {
        return String.format("Tituar: %s Agencia: %d Saldo: %f Numero: %d", titular, agencia, saldo, numero);
    }
}

