package br.com.letscode.aula;

import br.com.letscode.aula.impl.ContaCorrente;
import br.com.letscode.aula.impl.ContaPagamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
        interface =
     */

    public static void main(String[] args) {

        List<Pessoa> list = new ArrayList<>();

        list.add(new Pessoa(LocalDate.now().plusYears(-2)));
        list.add(new Pessoa(LocalDate.now().plusYears(-1)));
        list.add(new Pessoa(LocalDate.now().plusYears(-5)));

        for (Pessoa s : list) {
            System.out.println(s);
        }

        Collections.sort(list);

        for (Pessoa s : list) {
            System.out.println(s);
        }

    }

}
