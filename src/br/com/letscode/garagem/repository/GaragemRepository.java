package br.com.letscode.garagem.repository;

import br.com.letscode.garagem.model.Veiculo;

public interface GaragemRepository {

    void salvarVeiculo(Veiculo veiculo);

    void atualizarVeiculo(Veiculo veiculo);

    void recuperarVeiculo(String placa);

    void removerVeiculo(String placa);

}
