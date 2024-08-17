package map.PesquisaComMap.map;

public class Teste {
    public static void main(String[] args) {
        ContagemPalavras contando = new ContagemPalavras();

        contando.adicionarPalavra("Abelha", 7);
        contando.adicionarPalavra("Mamangava", 10);
        contando.adicionarPalavra("Abelha Rainha", 27);
        contando.adicionarPalavra("Zangão", 8);
        contando.adicionarPalavra("Abelha operária", 47);

        System.out.println("Existem " + contando.exibirContagemPalavras() + " palavras.");
        System.out.println("A palavra mais frequente é: " + contando.encontrarPalavraMaisFrequente());
    }
}
