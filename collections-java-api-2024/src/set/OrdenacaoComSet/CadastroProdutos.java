package set.OrdenacaoComSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    protected Set<Produtos> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }
    public void  adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtos.add(new Produtos(codigo, nome, preco, quantidade));
    }
    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtoPorNome = new TreeSet<>(produtos);
        return produtoPorNome;
    }
    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtos);
        return produtoPorPreco;
    }
    public Set<Produtos> exibirProdutosPorQuantidade(){
        Set<Produtos> produtoPorQuantidade = new TreeSet<>(new ComparatorPorQuantidade());
        produtoPorQuantidade.addAll(produtos);
        return produtoPorQuantidade;
    }
}
