package modelo;

import java.util.ArrayList;
import java.util.List;

public class Titular {

    private String nome;
    private String cpf;
    private String profissao;

    private ArrayList<Telefone> listaTelefones = new ArrayList<>();

    public Titular() {
    }

    public Titular(String cpf) {
        setCpf(cpf);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11){
            System.out.println("O cpf deve ter 11 posições");
        }else{
            this.cpf = cpf;
        }
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }


    public List<Telefone> getListaTelefones() {
        return listaTelefones;
    }

    public void salvaTelefone(String tipo, String ddd, String numero){

        Telefone fone = new Telefone();

        fone.setTipo(tipo);
        fone.setDdd(ddd);
        fone.setNumero(numero);

        listaTelefones.add(fone);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s CPF: %s", nome, cpf);
    }
}
