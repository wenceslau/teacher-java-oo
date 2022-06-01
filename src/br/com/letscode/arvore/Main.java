package br.com.letscode.arvore;

import br.com.letscode.arvore.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pA = new Pessoa("Razh Algun", null, null);
        Pessoa pB = new Pessoa("Talia Algun", pA, null);

        Pessoa p1 = new Pessoa("Thomas Wayne",null,null );
        Pessoa p2 = new Pessoa("Martha Wayne", null, null);

        Pessoa p3 = new Pessoa("Bruce Wayne", p1, p2);
        Pessoa p3B = new Pessoa("Damian Wayne", p3, pB);

        p3B.imprimeAncestrais();
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
