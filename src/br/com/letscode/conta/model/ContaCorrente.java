package br.com.letscode.conta.model;

public class ContaCorrente extends Conta {

    private Titular titular;

    public ContaCorrente(Titular titular, int agencia, int numero) {
        super(agencia, numero);
        this.titular = titular;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return String.format("Tituar: %s Agencia: %d Saldo: %f Numero: %d", titular, getAgencia(), retornarSaldo(), getNumero());
    }
}
