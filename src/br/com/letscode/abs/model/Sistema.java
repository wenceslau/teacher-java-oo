package br.com.letscode.abs.model;

public class Sistema {

    public void autenticar(String senha , Funcionario funcionario){

        boolean acessoOk = funcionario.validarAcesso(senha);

        if (acessoOk){
            System.out.println("Acessoo garantido");
        }else{
            System.out.println("Acesso negado");
        }

    }

}
