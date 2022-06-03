//package br.com.letscode.lampada.model;
//
//import br.com.letscode.enums.TipoLampada;
//import br.com.letscode.lampada.enums.TipoLampada;
//
//public class Lampada {
//
//    private boolean estado;
//    private int potencia;
//    private TipoLampada tipo;
//
//    public Lampada(TipoLampada tipo) {
//        this.tipo = tipo;
//    }
//
//
//    void ligar() {
//        this.estado = true;
//        System.out.println("Ligando Lampada");
//    }
//
//     void desligar() {
//        this.estado = false;
//        System.out.println("Desligando Lampada");
//    }
//
//     void ligaDesliga() {
//        // IF CONVENCIONAL
////        if (this.estado){
////            this.estado = false;
////        } else{
////            this.estado = true;
////        }
//        // MINI IF (IF TERNÁRIO)
////        this.estado = this.estado ? false : true;
//
//        this.estado = !this.estado;
//
//        System.out.println(this.estado ? "Ligando" : "Desligando");
//    }
//
//    @Override
//    public String toString() {
//        return "Lampada{" +
//                "estado=" + estado +
//                ", potencia=" + potencia +
//                ", tipo=" + tipo +
//                '}';
//    }
//
//    public boolean isEstado() {
//        return estado;
//    }
//
//    public void setEstado(boolean estado) {
//        this.estado = estado;
//    }
//
//    public int getPotencia() {
//        return potencia;
//    }
//
//    public void setPotencia(int potencia) {
//        this.potencia = potencia;
//    }
//
//    public TipoLampada getTipo() {
//        return tipo;
//    }
//
//}
