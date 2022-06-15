package br.com.letscode.televisao.view;

import br.com.letscode.televisao.enums.Acao;
import br.com.letscode.televisao.model.ControleRemoto;

import javax.naming.ldap.Control;
import java.util.Scanner;

public class Console {

    private ControleRemoto controleRemoto;

    public Console(ControleRemoto controleRemoto) {
        this.controleRemoto = controleRemoto;
    }

    public void criarMenu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção");

        int opcao = 0;

        do{
            System.out.println("1 - Aumentar Volume");
            System.out.println("2 - Diminuir Volume");
            System.out.println("3 - Subir Canal");
            System.out.println("4 - Descer Canal");
            System.out.println("5 - Alterar Canal");
            System.out.println("6 - Consultar Canal");
            System.out.println("7 - Consultar Volume");
            System.out.println("8 - Sair");

            opcao = scanner.nextInt();

            if (opcao == 8){
                break;
            }

            executarOpcao(opcao, scanner);

        }while (opcao != 8);

    }

    private void executarOpcao(int opcao, Scanner scanner) {

        switch (opcao){
            case 1:
                aumentarVolume();
                break;
            case 2:
                diminuirVolume();
                break;
            case 3:
                subirCanal();
                break;
            case 4:
                descerCanal();
                break;
            case 5:
                alterarCanal(scanner);
                break;
            case 6:
                System.out.println(controleRemoto.canal());
                break;
            case 7:
                System.out.println(controleRemoto.volume());
                break;
            default:
                System.out.println("Opcao invalida");

        }

    }

    private void alterarCanal(Scanner scanner) {
        int canal = scanner.nextInt();
        controleRemoto.alterarCanal(canal);
    }

    private void descerCanal() {
        controleRemoto.alterarCanal(Acao.DIMINUIR);
    }

    private void subirCanal() {
        controleRemoto.alterarCanal(Acao.AUMENTAR);
    }

    private void diminuirVolume() {
        controleRemoto.alterarVolume(Acao.DIMINUIR);
        imprimirVolume();
    }

    private void aumentarVolume() {
        controleRemoto.alterarVolume(Acao.AUMENTAR);
        imprimirVolume();
    }

    private void imprimirVolume(){
        String volume = "";
        for (int i = 0 ; i< controleRemoto.volume(); i++){
            volume += "|";
        }
        System.out.println("Volume: " + controleRemoto.volume() + " " + volume);
    }
}
