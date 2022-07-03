package br.com.letscode.solid.dependency.pkg1;

public class MatriculaService {

    private EmailService emailService;

    public MatriculaService() {
        emailService = new EmailService();
    }
    public void realizaMatricula(Aluno aluno){

        //regras de negocio da realizacao matriculas

        emailService.enviarEmail(aluno.getEmail());

    }
}
