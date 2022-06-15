package br.com.letscode.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main implements Comparable {

    public static void main(String[] args) {

        List<String > lst = new ArrayList<>();

        lst.add("Jessica");
        lst.add("Wenceslau");
        lst.add("Bruno");
        lst.add("Ana");

        System.out.println("Ordem de inserção");
        for (String integer : lst) {
            System.out.println(integer);
        }

        Collections.sort(lst);

        System.out.println("Ordem apos o sort");
        for (String integer : lst) {
            System.out.println(integer);
        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
