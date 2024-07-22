package list.PesquisaComList;

public class Teste {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Atento!", "Roberto", 2020);
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
//        catalogoLivros.pesquisarPorAutor("Autor 1");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Susan J. Fowler"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Peter Jandl Junior"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Roberto"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Atento!"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2015, 2022));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    }
}
