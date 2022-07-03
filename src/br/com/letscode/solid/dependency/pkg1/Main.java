package br.com.letscode.solid.dependency.pkg1;

public class Main {

    public static void main(String[] args) {

        MatriculaService matriculaService = new MatriculaService();

        Aluno aluno = new Aluno("Ana", "ana@ana.com");

        matriculaService.realizaMatricula(aluno);

    }

}
