package br.com.letscode.abstracoes;

import br.com.letscode.abstracoes.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        CalculaProventos calculaProventos = new CalculaProventos();
        Sistema sistema = new Sistema();

        Programador programador = new Programador("Jhon", 6000);
        Supervisor supervisor = new Supervisor("Ana", 5000);
        supervisor.setSenha("123");
        Estagiario estagiario = new Estagiario("Alan", 3000);
        Autenticavel funcAutenticaval = new Administrador("Jussara", 9000);
        funcAutenticaval.setSenha("123");

        System.out.println(calculaProventos.calcular(programador));
        System.out.println(calculaProventos.calcular(supervisor));
        System.out.println(calculaProventos.calcular(estagiario));


        System.out.println(sistema.autenticar(funcAutenticaval,"123"));
        System.out.println(sistema.autenticar(supervisor,"123"));

        List<Funcionario> lst = new ArrayList<>();
        lst.add(programador);
        lst.add(supervisor);


    }


}
