package br.com.letscode.calculadora;

import br.com.letscode.calculadora.enums.TipoOperador;
import br.com.letscode.calculadora.model.Calculadora;

public class Main {

    public static void main(String[] args) {

        String valor = "*";
        TipoOperador oper = TipoOperador.valueOf(valor);
        System.out.println(oper);

        Calculadora calc = new Calculadora();
        calc.entrada(2);
        calc.setOperador(TipoOperador.SOMA);
        calc.entrada(5);
        calc.setOperador(TipoOperador.DIVISAO);
        System.out.println(TipoOperador.DIVISAO.getCaracter());
        try {
            calc.entrada(0);
        }catch (RuntimeException ex){
            calc.entrada(2);
        }
        ///calc.calcular(5);
        System.out.println(calc.getValor());
    }
}
