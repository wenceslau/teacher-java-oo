package br.com.letscode.agenda;

import br.com.letscode.agenda.Model.Agenda;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.armazenarPessoa("Camila");
        agenda.armazenarPessoa("Leonardo");

        agenda.imprimeAgenda();

        agenda.imprimePessoa("Camila");

        agenda.removePessoa("Camila");

        agenda.imprimeAgenda();
    }


}
