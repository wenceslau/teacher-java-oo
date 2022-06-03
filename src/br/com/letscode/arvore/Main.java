package br.com.letscode.arvore;

import br.com.letscode.arvore.model.Pessoa;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        String opcao = "";
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Escolha uma Opção");
            System.out.println("1-Cadastrar Pessoa");
            System.out.println("2-Imprimir Ancestrais");
            System.out.println("X para sair");
            opcao = scanner.nextLine();
            switch (opcao){
                case "1":
                    cadastrar(scanner);
                    break;
                case "2":
                    imprimir();
                    break;
            }
        }while (!opcao.equalsIgnoreCase("X"));

        System.out.println("Programa finalizado");

//        Pessoa pA = new Pessoa("Razh Algun", null, null);
//        Pessoa pB = new Pessoa("Talia Algun", pA, null);
//
//        Pessoa p1 = new Pessoa("Thomas Wayne",null,null );
//        Pessoa p2 = new Pessoa("Martha Wayne", null, null);
//
//        Pessoa p3 = new Pessoa("Bruce Wayne", p1, p2);
//        Pessoa p3B = new Pessoa("Damian Wayne", p3, pB);

        //p3B.imprimeAncestrais();
    }

    public static void cadastrar(Scanner scanner){

        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();
        System.out.println("Infome o nome do Pai");
        String nomePai = scanner.nextLine();
        System.out.println("Informe o nome da Mãe");
        String nomeMae = scanner.nextLine();

        Pessoa pai = new Pessoa(nomePai,null, null);
        int index = pessoas.indexOf(pai);
        if (index >= 0){
            pai = pessoas.get(index);
        }else {
            pessoas.add(pai);
        }

        Pessoa mae = new Pessoa(nomeMae,null, null);
        index = pessoas.indexOf(mae);
        if (index > 0){
            mae = pessoas.get(index);
        }else{
            pessoas.add(mae);
        }

        Pessoa pessoaCadastrada = new Pessoa(nome, pai, mae);

        pessoas.add(pessoaCadastrada);

    }

    public static void imprimir(){
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimeAncestrais();
        }

        LocalDate l = LocalDate.now().plusYears(-10);
        LocalDate l1 =  LocalDate.now();

        long vl = Duration.between(l, l1).toDays();

        vl = vl / 363;

        Period period = Period.between(l, l1);
        period.getYears();

    }


//    public static void imprimePessoa(Pessoa pessoa){
//       if (pessoa != null) {
//           System.out.println("NOME: " + pessoa);
//           System.out.println("PAI: " + pessoa.getPai());
//           System.out.println("MÃE: " + pessoa.getMae());
//           System.out.println();
//           imprimePessoa(pessoa.getPai());
//           imprimePessoa(pessoa.getMae());
//       }
//    }
}
