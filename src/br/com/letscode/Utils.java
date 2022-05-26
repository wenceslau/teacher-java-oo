package br.com.letscode;

import java.util.logging.Logger;

public class Utils {
    public static Logger logger;

    public String nome;

    public void imprimeNome(){
        int num = convertInteiro("10");
        System.out.println(nome);
    }

    public static int convertInteiro(String valor){
        if (valor != null) {
            return Integer.valueOf(valor);
        }
        return 0;
    }
}
