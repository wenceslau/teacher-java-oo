package br.com.letscode.generics;

import br.com.letscode.aula.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> list = new ArrayList();
        list.add(new Pessoa(null));

        for (Pessoa elemento : list) {
            System.out.println(elemento.getNome());
        }

        Box<String> boxPalavras = new Box<>();
        boxPalavras.add("A");

        Box<Integer> boxNumeros = new Box<>();
        boxNumeros.add(10);

    }

}
