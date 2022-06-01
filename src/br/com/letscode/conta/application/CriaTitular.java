package br.com.letscode.conta.application;

import br.com.letscode.conta.enums.TipoTelefone;
import br.com.letscode.conta.model.Telefone;
import br.com.letscode.conta.model.Titular;

public class CriaTitular {

    public static void main(String[] args) {

        Titular titular1 = new Titular();

        titular1.setCpf("11122233344");
        titular1.setNome("João da Silva");
        titular1.salvaTelefone(TipoTelefone.CELULAR,"11", "988777788");
        titular1.salvaTelefone(TipoTelefone.FAX,"11", "323229889");
        titular1.salvaTelefone(TipoTelefone.RESIDENCIAL,"21", "323229889");
        titular1.salvaTelefone(TipoTelefone.CASA_DA_MAE,"31", "923229889");

        System.out.println(titular1.getNome());
        System.out.println(titular1.getCpf());

        for(Telefone tel : titular1.getListaTelefones()){
            System.out.println(tel);
        }


        System.out.println(titular1);

    }
}
