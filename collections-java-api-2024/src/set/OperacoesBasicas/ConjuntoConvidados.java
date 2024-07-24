package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidados convidadosParaRemover = null;
        for (Convidados c : convidadosSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadosParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadosParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }
}
