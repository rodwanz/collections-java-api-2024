package map.PesquisaComMap.map;

import map.PesquisaComMap.Produtos;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contandoPalavras;

    public ContagemPalavras() {
        this.contandoPalavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contandoPalavras.put(palavra, contagem);
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for (Map.Entry<String, Integer> entry : contandoPalavras.entrySet()){
            contagemTotal += entry.getValue();
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contandoPalavras.entrySet()){
            if (entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }
}
