package set.PesquisaComSet;

public class Teste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Pedro Nogueira", 991230978);
        agendaContatos.adicionarContato("Pedro Nogueira", 991230976);
        agendaContatos.adicionarContato("Pedro Moreira", 991230978);
        agendaContatos.adicionarContato("Pedro Fonseca", 992130978);
        agendaContatos.adicionarContato("Pedro Ferreira", 991230978);
        agendaContatos.adicionarContato("Pedro Bandeira", 991230977);
        agendaContatos.adicionarContato("Pedro Gonçalves", 991450978);
        agendaContatos.adicionarContato("Pedro Cavalcanti", 991230078);
        agendaContatos.adicionarContato("Roberto Cavalcanti", 991230078);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Roberto Cavalcanti"));
        System.out.println("Contato atualizado" + agendaContatos.atualizarNumeroContato("Pedro Nogueira", 989042341));

        agendaContatos.exibirContatos();
    }
}
