package br.com.letscode.abs;

import br.com.letscode.abs.model.*;

public class Main {

    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(150);
        supervisor.setSenha("123");
        System.out.println(supervisor.calculaBonus());

        Programador programador = new Programador();
        programador.setSalario(150);
        System.out.println(programador.calculaBonus());

        Estagiario estagiario = new Estagiario();
        estagiario.setSalario(150);
        System.out.println(estagiario.calculaBonus());

        CalculaProventos calculaProventos = new CalculaProventos();
        System.out.println("Salario + Bunus: " + calculaProventos.calcular(supervisor));
        System.out.println("Salario + Bunus: " + calculaProventos.calcular(programador));
        System.out.println("Salario + Bunus: " + calculaProventos.calcular(estagiario));


        Sistema sistema = new Sistema();
        sistema.autenticar("123", supervisor);


    }
}
