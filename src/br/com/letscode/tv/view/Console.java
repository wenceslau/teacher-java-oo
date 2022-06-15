package br.com.letscode.tv.view;

import br.com.letscode.tv.enuns.Acao;
import br.com.letscode.tv.model.ControleRemoto;

import java.util.Scanner;

public class Console {


    private ControleRemoto controleRemoto;

    public Console(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
    }

    public void criarMenu(Scanner scanner) {

        System.out.println("Escolha uma opção");

        int opcao;
        do {
            System.out.println("1 - Aumenar Volume");
            System.out.println("2 - Diminuir Volume");
            System.out.println("3 - Alterar Canal");
            System.out.println("4 - Consultar Volume");
            System.out.println("5 - Consultar Canal");
            System.out.println("6 - Sair");
            opcao = scanner.nextInt();

            executarOpcao(scanner, opcao);

        } while (opcao != 6);

    }

    private void executarOpcao(Scanner scanner, int opcao) {

        switch (opcao){
            case 1:
                aumenarVolume();
                break;
            case 2:
                diminuirVolume();
                break;
            case 3:
                System.out.println();
                alterarCanal(scanner);
                break;
            case 4:
                System.out.println("Volume : "+ controleRemoto.volume());
                break;
            case 5:
                System.out.println("Canal : "+ controleRemoto.canal());
                break;
            default:
                break;

        }
    }

    private void alterarCanal(Scanner scanner) {
        System.out.print("Informe o Canal: ");
        int canal = scanner.nextInt();
        try {
            controleRemoto.alterarCanal(canal);
            System.out.println("Canal : "+ controleRemoto.canal());
        }catch (RuntimeException ex){
            System.out.println(">>>>>"+ex.getMessage());
            alterarCanal(scanner);
        }
    }

    private void aumenarVolume() {
        controleRemoto.alterarVolume(Acao.AUMENTAR);
        imprimirVolume();
    }

    private void diminuirVolume() {
        controleRemoto.alterarVolume(Acao.DIMINUIR);
        imprimirVolume();
    }

    private void imprimirVolume() {
        String volume = "";
        for (int i = 0; i < controleRemoto.volume() ; i++) {
            volume += "|";
        }
        System.out.println("Volume: " + controleRemoto.volume() + " " + volume);
    }

}
