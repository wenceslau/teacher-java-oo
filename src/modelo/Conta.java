package modelo;

public class Conta {
    private Titular titular;

    private int agencia;

    private double saldo;

    private int numero;

    public Titular getTitular() {
        return titular;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (temSaldo(valor)) {
            saldo -= valor;
        }
    }

    public double retornarSaldo() {
        return saldo;
    }

    public void transferir(double valor, Conta contaDestino){
        if (temSaldo(valor)){
            sacar(valor);
            contaDestino.depositar(valor);
        }
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

