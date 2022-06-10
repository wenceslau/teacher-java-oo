package br.com.letscode.conta.model;

public class ContaConjunta extends Conta {

    private Titular titular1;
    private Titular titular2;

    public ContaConjunta(Titular titular1, Titular titular2, int agencia, int numero) {
        super(agencia, numero);
        this.titular1 = titular1;
        this.titular2 = titular2;
    }

    public Titular getTitular1() {
        return titular1;
    }

    public void setTitular1(Titular titular1) {
        this.titular1 = titular1;
    }

    public Titular getTitular2() {
        return titular2;
    }

    public void setTitular2(Titular titular2) {
        this.titular2 = titular2;
    }
}
