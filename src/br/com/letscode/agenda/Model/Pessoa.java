package br.com.letscode.agenda.Model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

//        Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
//        seguintes operações:
//        void armazenaPessoa(String nome, int idade, float altura);
//        void removePessoa(String nome);
//        int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
//        void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
//        void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
//        agenda.
public class Pessoa {

    private String nome;
    private LocalDate nascimento;
    private float altura;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public long idade() {
        if (nascimento != null) {
            return ChronoUnit.YEARS.between(nascimento, LocalDate.now());
        }
        return 0;

//  Método 2
//        return nascimento.until(LocalDate.now(), ChronoUnit.YEARS);
//  Método 1
//        int anoAtual = LocalDate.now().getYear();
//        int anoNasc = nascimento.getYear();
//        LocalDate aniversario = nascimento.plusYears(anoAtual - anoNasc);
//        if (LocalDate.now().isBefore(aniversario)){
//            return anoAtual - anoNasc - 1;
//            } else {
//            return anoAtual - anoNasc;
//        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String imprimir() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", idade=" + idade() +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return imprimir();
    }
}