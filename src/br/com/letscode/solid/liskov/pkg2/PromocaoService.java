package br.com.letscode.solid.liskov.pkg2;

import br.com.letscode.solid.liskov.pkg1.Funcionario;

public class PromocaoService {

    public void efetivarPromocao(FuncionarioPromovivel funcionario){

        // regras bla bla bla regras....

        funcionario.promover();

    }

}
