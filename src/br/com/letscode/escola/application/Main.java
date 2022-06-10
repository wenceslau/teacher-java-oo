package br.com.letscode.escola.application;

import br.com.letscode.escola.model.Auxilar;
import br.com.letscode.escola.model.Pessoa;
import br.com.letscode.escola.model.Professor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setNascimento(LocalDate.now().plusYears(-20));
        System.out.println(pessoa.retornaIdade());

        Professor professor = new Professor();
        Pessoa pessoaProf = new Pessoa();
        pessoaProf.setNome("Joao");
        pessoaProf.setNascimento(LocalDate.now().plusYears(-28));
        professor.setPessoa(pessoaProf);
        System.out.println(professor.getIdade());

//        Auxilar auxilar = new Auxilar();
//        auxilar.setNome("Marcio");
//        auxilar.setNascimento(LocalDate.now().plusYears(-25));
//        System.out.println(auxilar.retornaIdade());

    }
}
