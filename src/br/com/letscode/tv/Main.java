package br.com.letscode.tv;

import br.com.letscode.tv.model.ControleRemoto;
import br.com.letscode.tv.model.Televisao;
import br.com.letscode.tv.view.Console;
import br.com.letscode.tv.view.Janela;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto(televisao);

        //console(controleRemoto);
        window(controleRemoto);
    }

    private static void console(ControleRemoto controleRemoto) {
        Console view = new Console(controleRemoto);
        view.criarMenu(new Scanner(System.in));
    }

    private static void window(ControleRemoto controleRemoto) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela(controleRemoto).setVisible(true);
            }
        });
    }
}
