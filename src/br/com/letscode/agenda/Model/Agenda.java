package br.com.letscode.agenda.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*

Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.

 */

public class Agenda {

    private Set<Pessoa> contatos = new HashSet<>();

    public boolean armazenarPessoa(String nome){
        return contatos.add(new Pessoa(nome));
    }

    public boolean removePessoa(String nome){
        return contatos.remove(new Pessoa(nome));
    }

    public Pessoa buscaPessoa(String nome){
        for (Pessoa contato : contatos) {
            if (contato.getNome().equals(nome)){
                return contato;
            }
        }
        return  null;
    }

    public void imprimeAgenda(){
        for (Pessoa contato : contatos) {
            System.out.println(contato.imprimir());
        }
    }

    public void imprimePessoa(String nome){
        System.out.println(buscaPessoa(nome));
    }

}
