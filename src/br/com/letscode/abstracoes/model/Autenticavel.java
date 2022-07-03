package br.com.letscode.abstracoes.model;

public interface Autenticavel {

    void setSenha(String senha);

    boolean validarAcesso(String senha);

}
