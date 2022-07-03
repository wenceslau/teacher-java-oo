package br.com.letscode.solid.single;

public class Matricula {

    private Aluno aluno;
    private Curso curso;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    public void matricular(){
        //codigo que realiza a matricula

        Notifications notifications = new Notifications();
        notifications.enviarEmail(aluno.getEmail(),"Olá voce foi matriculado" );

    }
}
