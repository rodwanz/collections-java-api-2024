package set.OrdenacaoComSet;

public class Teste {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1001, "Arroz", 23.95, 5);
        cadastroProdutos.adicionarProduto(1002, "Macarrão", 6.95, 10);
        cadastroProdutos.adicionarProduto(1003, "Feijão", 9.95, 7);
        cadastroProdutos.adicionarProduto(1004, "Oleo", 8.95, 3);
        cadastroProdutos.adicionarProduto(1005, "Açucar", 3.95, 4);
        cadastroProdutos.adicionarProduto(1006, "Pasta de dente", 7.95, 2);
        cadastroProdutos.adicionarProduto(1007, "Desodorante", 18.95, 6);

//        System.out.println(cadastroProdutos.produtos);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorQuantidade());


    }
}
