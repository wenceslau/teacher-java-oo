package br.com.letscode.solid.dependency.pkg2;


public class Main {

    public static void main(String[] args) {
       int tipo  = 0;

       ComunicacaoService comunicacaoService;

       if (tipo == 0) {
           comunicacaoService = new EmailService();
       } else if (tipo == 1){
           comunicacaoService = new WhatsAppService();
       } else{
           comunicacaoService = new SMSService();
       }

       MatriculaService matriculaService = new MatriculaService(comunicacaoService);

       Aluno aluno = new Aluno("Ana", "ana@ana.com");

       matriculaService.realizaMatricula(aluno);

    }

}
