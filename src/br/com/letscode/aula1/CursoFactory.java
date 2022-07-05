package br.com.letscode.aula1;


import br.com.letscode.factory.CursoException;

public class CursoFactory {

    private CursoFactory() {
    }

    public static Curso criarCurso(Aluno aluno, TipoCurso tipoCurso){

        Curso curso;
        switch (tipoCurso){

            case GRADUACAO:
                curso = criarCursoGraduacao(aluno);
                break;
            case POS_GRADUACAO:
                curso = criarCursoPosGraduacao(aluno);
                break;
            default:
                throw new CursoException("Opção invalida");
        }
        return  curso;
    }

    private static Curso criarCursoPosGraduacao(Aluno aluno) {
        if (aluno.getTipoAluno().equals(TipoAluna.GRADUADO)){
            return new PosGraduacao(aluno, TipoCurso.POS_GRADUACAO);
        }
        throw new CursoException("Tipo invalido");
    }

    private static Curso criarCursoGraduacao(Aluno aluno) {
        Curso curso;
        if (aluno.getTipoAluno().equals(TipoAluna.ENSINO_MEDIO)){
             curso = new Graducao(aluno, TipoCurso.GRADUACAO);
        } else {
            throw new CursoException("Tipo invalido");
        }
        return curso;
    }


}
