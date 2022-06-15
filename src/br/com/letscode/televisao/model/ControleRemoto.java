package br.com.letscode.televisao.model;

import br.com.letscode.televisao.enums.Acao;

public class ControleRemoto {

    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void alterarVolume(Acao acao){
        if (existeTV()) {
            televisao.alterarVolume(acao);
        }
    }

    public void alterarCanal(Acao acao){
        if (existeTV()) {
            televisao.alterarCanal(acao);
        }
    }

    public void alterarCanal(int canal){
        if (existeTV()) {
            televisao.alterarCanal(canal);
        }
    }

    public int canal(){
        if (existeTV()) {
            return televisao.getCanal();
        }
        return 0;
    }

    public int volume(){
        if (existeTV()) {
            return televisao.getVolume();
        }
        return 0;
    }

    private boolean existeTV(){
        if (televisao != null){
            return true;
        }
        return  false;
    }

}
