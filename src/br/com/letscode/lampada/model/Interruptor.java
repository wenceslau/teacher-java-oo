package br.com.letscode.lampada.model;

public class Interruptor {

    private boolean estado;
    private Lampada lampada;

    public Interruptor(Lampada lampada) {
        this.lampada = lampada;
    }

    public Interruptor() {

    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void ligar() {
        System.out.println("Ligando Interruptor");
        if(!this.estado){
            this.estado = true;
            if(lampada != null) {
                lampada.ligar();
            }
        }
    }

    public void desligar() {
        System.out.println("Desligando Interruptor");
        if(this.estado){
            this.estado = false;
            if(lampada != null) {
                lampada.desligar();
            }
        }
    }

    @Override
    public String toString() {
        return "Interruptor{" +
                "lampada=" + lampada +
                '}';
    }
}
