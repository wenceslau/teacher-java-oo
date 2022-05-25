package aplicacao;

import modelo.Telefone;
import modelo.Titular;

public class CriaTitular {

    public static void main(String[] args) {

        Titular titular1 = new Titular();

        titular1.setCpf("11122233344");
        titular1.setNome("João da Silva");
        titular1.salvaTelefone("Celular","11", "988777788");
        titular1.salvaTelefone("Comercial","11", "323229889");
        titular1.salvaTelefone("Residencia","21", "323229889");
        titular1.salvaTelefone("Celular","31", "923229889");


        System.out.println(titular1.getNome());
        System.out.println(titular1.getCpf());

        for(Telefone tel : titular1.getListaTelefones()){
            System.out.println(tel);
        }


        System.out.println(titular1);

    }
}
