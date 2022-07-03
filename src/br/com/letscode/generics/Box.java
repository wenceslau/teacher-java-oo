package br.com.letscode.generics;

public class Box<T> {

    private T elemento;

    public void add(T elemento){
        this.elemento = elemento;
    }

    public T getObject() {
        return elemento;
    }
}
