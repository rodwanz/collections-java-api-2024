package set.PesquisaComSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatosSet);
    }
    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatosPorNome = new HashSet<>();
        for (Contatos c : contatosSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contatos atualizarNumeroContato(String nome, int numeroNovo){
        Contatos contatosAtuaizado = null;
        for (Contatos c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numeroNovo);
                contatosAtuaizado = c;
                break;
            }
        }
        return contatosAtuaizado;
    }
}
