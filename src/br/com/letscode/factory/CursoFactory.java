package br.com.letscode.factory;

import br.com.letscode.trabalho.contas.TipoConta;

public class CursoFactory {

    private CursoFactory cursoFactory;

    public static Curso criarCurso(Aluno aluno, TipoCurso tipoCurso){

        switch (tipoCurso) {
            case GRADUACAO:
                return criarCursoGraducao(aluno);
            case POS_GRADUCAO:
                return criarCursoPosGraducao(aluno);
            default:
                throw new IllegalArgumentException("Opção inválida!");
        }

    }

    private static Curso criarCursoGraducao(Aluno aluno) {

        if (aluno.getTipoAluno().equals(TipoAluno.ENSINO_MEDIO)){
            throw new CursoException("Tipo de aluno invalido");
        }
        return new Graducao(aluno, TipoCurso.GRADUACAO);
    }

    private static Curso criarCursoPosGraducao(Aluno aluno) {

        if (!aluno.getTipoAluno().equals(TipoAluno.GRADUADO)){
            throw new CursoException("Tipo de aluno invalido");
        }

        return new PosGraduacao(aluno, TipoCurso.POS_GRADUCAO);

    }

}
