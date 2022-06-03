package br.com.letscode.calculadora.model;

import br.com.letscode.calculadora.enums.TipoOperador;

public class Calculadora {

    private double valor;
    private TipoOperador operador = null;

    public void entrada(double valor) {
        if (operador != null) {
            calcular(valor);
        } else {
            this.valor = valor;
        }
    }

    public void setOperador(TipoOperador operador) {
        this.operador = operador;
    }

    private void calcular(double numero){
        valor = TipoOperador.calcular(operador, valor, numero);
        operador = null;
    }

    public double getValor() {
        return valor;
    }
}
