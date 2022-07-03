package br.com.letscode.abstracoes.model;

public class Sistema {

    public boolean autenticar(Autenticavel autenticavel, String senha){
        return autenticavel.validarAcesso(senha);
    }
}
