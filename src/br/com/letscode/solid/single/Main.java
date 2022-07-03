package br.com.letscode.solid.single;

import br.com.letscode.solid.single.Aluno;
import br.com.letscode.solid.single.Curso;
import br.com.letscode.solid.single.Matricula;
import br.com.letscode.solid.single.Notifications;

import java.util.Currency;

public class Main {



    /*


    SOLID é um acrônimo para cinco princípios de design a fim de orientar um código mais compreensível, flexível e manutenível. Os cinco princípios propostos por Robert C. Martin em seu livro Código Limpo, são:

    S - Single-Responsibility Principle

    O - Open-Closed Principle

    L - Liskov Substitution Principle

    I - Interface Segregation Principle

    D - Dependency Inversion Principle

     */


    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setEmail("ana@ana.com");

        Curso curso = new Curso();

        Matricula matricula = new Matricula(aluno, curso);
        matricula.matricular();


    }
}
