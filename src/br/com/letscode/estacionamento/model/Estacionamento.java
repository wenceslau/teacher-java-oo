package br.com.letscode.estacionamento.model;

import java.util.ArrayList;

public class Estacionamento {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void estacionar(Veiculo veiculo){

        if (veiculo instanceof Carro){
            Carro carro = (Carro) veiculo;
            System.out.println("O carro de quantidade de portas entrou" + carro.getQuantidadePorta());
        }else if (veiculo instanceof Moto){
            Moto moto = (Moto) veiculo;
            System.out.println("A moto de quantidade de cilindradas entrou" + moto.getQuantidadeCilindradas());
        } else if (veiculo instanceof Barco){
            Barco barco = (Barco) veiculo;
            System.out.println("O barco de potencia entrou" + barco.getPotenciaMotor());
        }else{
            System.out.println("Veiculo desconhecido entrou");
        }

        veiculos.add(veiculo);
    }

    public void estacionaMoto(Moto moto){
        veiculos.add(moto);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
}
