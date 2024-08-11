package list.Ordenacao.ordenacao;

import list.OperacoesBasicas.Tarefa;
import list.Ordenacao.Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosOrdenados;

    public OrdenacaoNumeros() {
        this.numerosOrdenados = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosOrdenados.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosOrdenados);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosOrdenados);
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }
    public void exibirNumeros(){
        if (!numerosOrdenados.isEmpty()){
            System.out.println(this.numerosOrdenados);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
}
