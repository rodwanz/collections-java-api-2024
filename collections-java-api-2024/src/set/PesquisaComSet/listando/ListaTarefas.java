package set.PesquisaComSet.listando;

import list.OperacoesBasicas.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefas> conjuntoTarefas;

    public ListaTarefas() {
        this.conjuntoTarefas = new HashSet<>();
    }
    public void adicionarTarefa(Tarefas tarefa){
        conjuntoTarefas.add(tarefa);
    }
    public void removerTarefa(String descricao){
        Tarefas tarefaRemover = null;
        for (Tarefas t : conjuntoTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = t;
                break;
            }
        }
    }
    public void exibirTarefas(){
        System.out.println(conjuntoTarefas);
    }
    public int contarTarefas(){
        return conjuntoTarefas.size();
    }
    public Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : conjuntoTarefas){
            if (t.isOncluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasNNaoConcluidas = new HashSet<>();
        for (Tarefas t : conjuntoTarefas){
            if (t.isOncluida()){
                tarefasNNaoConcluidas.add(t);
            }
        }
        return tarefasNNaoConcluidas;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefas t : conjuntoTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefas t : conjuntoTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas(){
        conjuntoTarefas.clear();
    }
}
