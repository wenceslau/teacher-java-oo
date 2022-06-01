package br.com.letscode.lampada;

import br.com.letscode.enums.TipoLampada;
import br.com.letscode.lampada.enums.TipoLampada;
import br.com.letscode.lampada.model.Interruptor;
import br.com.letscode.lampada.model.Lampada;
import br.com.letscode.model.Interruptor;
import br.com.letscode.model.Lampada;

public class Main {

    /**
     *
     * Criar um programinha para controlar o estado de uma lampada usando
     * um interruptor

     -  Modele um programa para representar a árvore genealógica de uma familia.
        Para tal, crie uma classe Pessoa que permita indicar, além de nome e idade,
        o pai e a mae. Tenha em mente que pai e mãe também são do tipo Pessoa.
        Faça um programa para Executar a arvore Genealogica modelada acima
     */

    public static void main(String[] args) {

        Lampada lampada = new Lampada(TipoLampada.FLUORESCENTE);
        

        Interruptor interruptor = new Interruptor();

        interruptor.ligar();
        System.out.println(interruptor);

        interruptor.desligar();
        System.out.println(interruptor);





    }
}
