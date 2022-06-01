package br.com.letscode.conta.application;

import java.util.ArrayList;

public class CriaLista {

    public static void main(String[] args) {

        String[] array = new String[2];
        array[0] = "AAAA";
        array[1] = "BBBB";

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        ArrayList<String> lista = new ArrayList<>();
        lista.add("AAAA");
        lista.add("AAA1");
        lista.add("AAA2");
        lista.add("AAA3");
        lista.add("AAA4");
        lista.add("AAA5");
        lista.add("AAA6");
        lista.add("AAA7");
        System.out.println(lista.size());
        System.out.println(lista.get(2));

        for(String valor : lista ){
            System.out.println(valor);
        }



    }
}
