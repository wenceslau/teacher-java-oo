package br.com.letscode.tv.model;

public class Televisao {

    private int canal;
    private int volume;

    public void aumentarVolume(){
        if (volume != 100){
            volume++;
        }
    }

    public void diminuirVolume(){
        if (volume != 0){
            volume--;
        }
    }

    public void subirCanal(){
        if (canal != 10){
            canal++;
        }
    }

    public void descerCanal(){
        if (canal != 0){
            canal--;
        }
    }

    public void trocarCanal(int canal){
        //Canal menor que 0 e maior 100, não é permitido
        if (canal < 0 || canal > 100){
            throw new RuntimeException("Canal Invalido");
        }
        this.canal = canal;
    }

    int getCanal() {
        return canal;
    }

    int getVolume() {
        return volume;
    }
}
