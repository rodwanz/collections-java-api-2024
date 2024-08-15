package map.OperacoesBasicas.mapeando;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario() {
        this.palavras = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if (!palavras.isEmpty()){
            palavras.remove(palavra);
        }
    }
    public void exibirPalavras(){
        if (!palavras.isEmpty()){
            System.out.println(palavras);
        }
    }
    public String pesquisarPorPalavra(String palavra){
        return palavras.get(palavra);
    }
}
