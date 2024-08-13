package set.PesquisaComSet.listando;

public class Teste {
    public static void main(String[] args) {
        ListaTarefas listando = new ListaTarefas();

        listando.adicionarTarefa(new Tarefas("Estudando Java", true));
        listando.adicionarTarefa(new Tarefas("Avançando em Collections", false));
        listando.adicionarTarefa(new Tarefas("Melhorando entendimento em Programação Funcional", false));
        listando.adicionarTarefa(new Tarefas("Aprendendo mais sobre Streams", true));
        listando.adicionarTarefa(new Tarefas("Seguindo com orientação a objetos", true));
        listando.adicionarTarefa(new Tarefas("Treinando muay tai", false));
        listando.exibirTarefas();

        System.out.println("Quantas tarefas existem " + listando.contarTarefas() + " sendo praticadas");

//        System.out.println("Tarefas concluidas" + listando.obterTarefasConcluidas());

//        System.out.println("Tarefas pendentes" + listando.obterTarefasPendentes());

        listando.removerTarefa("Treinando muay tai");

//        listando.marcarTarefaConcluida("Aprendendo mais sobre Streams");
        listando.exibirTarefas();
    }
}
