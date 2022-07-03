package br.com.letscode.aula.interfaces;

public interface Pagamento {

    boolean debito(String barCode, double valor);
}
