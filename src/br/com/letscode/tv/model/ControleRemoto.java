package br.com.letscode.tv.model;

import br.com.letscode.tv.enuns.Acao;

public class ControleRemoto {

    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void alterarVolume(Acao acao){
        if (televisao != null) {
            if (acao.equals(Acao.AUMENTAR)) {
                televisao.aumentarVolume();
            } else {
                televisao.diminuirVolume();
            }
        }
    }

    public void alterarCanal(Acao acao){
        if (televisao != null) {
            if (acao.equals(Acao.AUMENTAR)) {
                televisao.subirCanal();
            } else {
                televisao.descerCanal();
            }
        }
    }

    public void alterarCanal(int numeroCanal){
        if (televisao != null){
            televisao.trocarCanal(numeroCanal);
        }
    }

    public int canal(){
        return televisao.getCanal();
    }

    public int volume(){
        return televisao.getVolume();
    }

}
