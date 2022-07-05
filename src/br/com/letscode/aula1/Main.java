package br.com.letscode.aula1;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ana", TipoAluna.GRADUADO);

        Curso curso = CursoFactory.criarCurso(aluno, TipoCurso.GRADUACAO);


    }

}
