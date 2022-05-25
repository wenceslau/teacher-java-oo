package aplicacao;

import modelo.Conta;
import modelo.Titular;

public class CriaConta {

    public static void main(String[] args) {

        Titular titularConta1 = new Titular();
        titularConta1.setNome("João Macarenhas");
        titularConta1.setCpf("19933300099");
        titularConta1.setProfissao("Desenvolvedor");

        System.out.println(titularConta1.getCpf());

        Conta contaA = new Conta(titularConta1,3342,609733);
        contaA.depositar(500);
        System.out.println(contaA);
        contaA.sacar(100);
        System.out.println(contaA);

        System.out.println("Titular: "+ contaA.retornaNomeTitular());

        System.out.println("Agencia: "+ contaA.getAgencia());

        contaA.setAgencia(3510);

        System.out.println("Agencia: "+ contaA.getAgencia());

//        Titular titularConta2 = new Titular();
//        titularConta2.nome = "Maria Magdala";
//        titularConta2.cpf = "00099988899";
//        titularConta2.profissao = "Desenvolvedora";
//
//        Conta contaMaria = new Conta(titularConta2,3342,609734 );
//
//        contaJoao.transferir(150, contaMaria);
//
//        System.out.println(contaJoao);
//        System.out.println(contaMaria);

//        System.out.println("Titular: " + contaJoao.titular);
//        System.out.println("Agencia: " + contaJoao.agencia);
//        System.out.println("Saldo: " + contaJoao.retornarSaldo());
//
//        contaJoao.depositar(500);
//        System.out.println("Saldo: " + contaJoao.retornarSaldo());

    }
}
