package map.OperacoesBasicas.mapeando;

public class Teste {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("biblioteca" , "conjunto de livros");
        dicionario.adicionarPalavra("futebol" , "joga com os pés");
        dicionario.adicionarPalavra("handebol" , "joga com as mãos");
        dicionario.adicionarPalavra("vôlei" , "joga a bola de um lado para o outro da rede");
        dicionario.adicionarPalavra("tartarugas" , "voam");
        dicionario.adicionarPalavra("tartarugas" , "deita e rola");
        dicionario.exibirPalavras();

        String definicaoFutebol = dicionario.pesquisarPorPalavra("futebol");
        System.out.println("Definição da palavra 'futebol': " + definicaoFutebol);

        String definicaoTartaruga = dicionario.pesquisarPorPalavra("tartarugas");
        System.out.println("Definição da palavra 'tartarugas': " + definicaoTartaruga);
//        String definicaoNova = dicionario.pesquisarPorPalavra("deita e rola");
//        System.out.println("Definição da palavra 'tartarugas': " + definicaoNova);
//
//        String definicaoUva = dicionario.pesquisarPorPalavra("uva");
//        System.out.println("Definição da palavra 'uva': " + definicaoUva);

        dicionario.removerPalavra("tartaruga");
        System.out.println("Como fica se retirar a 'tartaruga' : ");
        dicionario.exibirPalavras();
    }
}
