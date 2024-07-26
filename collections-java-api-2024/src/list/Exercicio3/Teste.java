package list.Exercicio3;

public class Teste {
    public static void main(String[] args) {
        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        somaDeNumeros.adicionarNumero(5);
        somaDeNumeros.adicionarNumero(4);
        somaDeNumeros.adicionarNumero(56);
        somaDeNumeros.adicionarNumero(-5);
        somaDeNumeros.adicionarNumero(25);

        System.out.println("Adicionar números: ");
        somaDeNumeros.exibirNumeros();

        System.out.println("A soma dos números é: " + somaDeNumeros.calcularSoma());
        System.out.println("Maior númro: " + somaDeNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaDeNumeros.encontrarMenorNumero());
    }
}
