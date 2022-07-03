package br.com.letscode.solid.dependency.pkg2;

public class MatriculaService {

    private ComunicacaoService comunicacaoService;

    public MatriculaService(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }

    public void realizaMatricula(Aluno aluno){

        //regras de negocio da realizacao matriculas

        comunicacaoService.send("Matricula realizada", aluno.getEmail());

    }


}
