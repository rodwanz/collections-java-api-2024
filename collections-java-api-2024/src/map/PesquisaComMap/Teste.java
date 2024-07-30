package map.PesquisaComMap;

public class Teste {
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(10001, "òculos escuro", 34, 42.90);
        estoqueProdutos.adicionarProduto(10002, "òculos escuro de voley", 14, 40.90);
        estoqueProdutos.adicionarProduto(10003, "òculos escuro de grau", 37, 39.90);
        estoqueProdutos.adicionarProduto(10004, "òculos de grau pra perto", 23, 28.90);
        estoqueProdutos.adicionarProduto(10005, "òculos de grau pra longe", 3, 29.90);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato do estoque: R$" + estoqueProdutos.obterProdutoMaisCaro());
    }
}
