package set.OrdenacaoComSet.gerenciando;

public class Teste {
    public static void main(String[] args) {
        GerenciandoAlunos gerenciandoAlunos = new GerenciandoAlunos();

        gerenciandoAlunos.adicionarAluno(new Aluno("Miguel", 123456, 9));
        gerenciandoAlunos.adicionarAluno(new Aluno("Sophia", 123456, 9));
        gerenciandoAlunos.adicionarAluno(new Aluno("Maria Eduarda", 123456, 7));
        gerenciandoAlunos.adicionarAluno(new Aluno("Rodrigo", 123456, 7));
        gerenciandoAlunos.adicionarAluno(new Aluno("Felipe", 123456, 8));
        gerenciandoAlunos.adicionarAluno(new Aluno("Lucas", 123456, 8));
        gerenciandoAlunos.adicionarAluno(new Aluno("Liticia", 123456, 7));

        gerenciandoAlunos.exibirAlunosPorNome();
        gerenciandoAlunos.exibirAlunosPorNota();
    }
}
