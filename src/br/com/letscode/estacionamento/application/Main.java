package br.com.letscode.estacionamento.application;

import br.com.letscode.agenda.Model.Pessoa;
import br.com.letscode.estacionamento.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Peugeot");

        Carro carro = new Carro();
        carro.setMarca("Peugeot");
        carro.setQuantidadePorta(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setQuantidadeCilindradas(150);

        estacionamento.estacionar(veiculo);
        estacionamento.estacionar(carro);
        estacionamento.estacionar(moto);
        estacionamento.estacionaMoto(moto);

//        Veiculo veiculo1 = new Carro();
//        veiculo1.setMarca("Mercedes");
//        System.out.println(veiculo1.getMarca());
//
//        Carro carro1 = (Carro) veiculo1;
//        carro1.setQuantidadePorta(4);
//
//        System.out.println(carro1.getMarca());
//        System.out.println(carro1.getQuantidadePorta());

    }
}
