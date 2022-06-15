package br.com.letscode.televisao;

import br.com.letscode.televisao.enums.Acao;
import br.com.letscode.televisao.model.ControleRemoto;
import br.com.letscode.televisao.model.Televisao;
import br.com.letscode.televisao.view.Console;
import br.com.letscode.televisao.view.Janela;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        //Console console = new Console(controleRemoto);
        //console.criarMenu();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Janela janela = new Janela(controleRemoto);
                janela.setVisible(true);
            }
        });
    }
}
