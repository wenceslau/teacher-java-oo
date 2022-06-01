package br.com.letscode.conta.model;

import br.com.letscode.conta.enums.TipoTelefone;

public class Telefone {

    private TipoTelefone tipo;
    private String ddd;
    private String numero;

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s Fone: %s", tipo, ddd+numero);
    }
}
