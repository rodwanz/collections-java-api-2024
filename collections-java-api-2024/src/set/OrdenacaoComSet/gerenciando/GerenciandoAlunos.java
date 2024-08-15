package set.OrdenacaoComSet.gerenciando;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GerenciandoAlunos {
    Set<Aluno> alunos;

    public GerenciandoAlunos() {
        this.alunos = new HashSet<>();
    }
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void removerAluno(long matricula){
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()){
            Aluno next = iterator.next();
            if (next.getMatricula() == matricula){
                iterator.remove();
            }
        }
    }
    public Set<Aluno> getAlunos(){
        return alunos;
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        System.out.println(alunosPorNome);
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparandoNotaAlunos());
        alunosPorNota.addAll(alunos);
        System.out.println(alunosPorNota);
    }
}
