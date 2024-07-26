package list.Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numeros){
        this.numeros.add(numeros);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()){
            Collections.sort(numerosAscendentes);
        }
        return numerosAscendentes;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()){
            numerosAscendentes.sort(Collections.reverseOrder());
        }
        return numerosAscendentes;
    }
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }
}
