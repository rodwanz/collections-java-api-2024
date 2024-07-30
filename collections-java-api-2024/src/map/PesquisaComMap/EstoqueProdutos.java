package map.PesquisaComMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produtos> estoquePeodutos;

    public EstoqueProdutos() {
        this.estoquePeodutos = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoquePeodutos.put(cod, new Produtos(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoquePeodutos);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoquePeodutos.isEmpty()){
            for (Produtos p : estoquePeodutos.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }
    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoquePeodutos.isEmpty()){
            for (Produtos p : estoquePeodutos.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
