package br.com.letscode.aula1;

import java.sql.Connection;

public class ConexaoBanco {

    private static Connection connection = null;

    private ConexaoBanco() {
    }

    public static Connection criaConexao(){

        if (connection != null){
            return connection;
        }

        //cria uma conexao;
        return connection;
    }

}
