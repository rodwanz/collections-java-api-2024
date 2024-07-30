package map.OperacoesBasicas;

public class Teste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Miguel", 993456732);
        agendaContatos.adicionarContato("Elena", 993455532);
        agendaContatos.adicionarContato("Aurora", 992156761);
        agendaContatos.adicionarContato("leticia", 998456032);
        agendaContatos.adicionarContato("Lucas", 996543732);
        agendaContatos.adicionarContato("Demetrio", 993454539);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Demetrio");
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Miguel");
    }
}
