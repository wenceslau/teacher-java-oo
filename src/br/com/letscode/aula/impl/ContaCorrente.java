package br.com.letscode.aula.impl;

import br.com.letscode.aula.interfaces.Conta;

public class ContaCorrente implements Conta {

    @Override
    public boolean depositar(double valor) {
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        return false;
    }
}
