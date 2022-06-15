package br.com.letscode.televisao.model;

import br.com.letscode.televisao.enums.Acao;

public class Televisao {

    private int volume;
    private int canal;
    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void alterarVolume(Acao acao){
        if (Acao.AUMENTAR.equals(acao)){
            if (volume < 100) {
                volume++;
            }
        }else{
            if (volume > 0) {
                volume--;
            }
        }
    }

    public void alterarCanal(Acao acao){
        if (Acao.AUMENTAR.equals(acao)){
            alterarCanal(getCanal() + 1);
        }else{
            alterarCanal(getCanal() - 1);
        }
    }

    public void alterarCanal(int canal){
        if (canal < 0 || canal > 9 ) {
            throw new RuntimeException("Canal Invalido");
        }
        this.canal = canal;
    }

}
