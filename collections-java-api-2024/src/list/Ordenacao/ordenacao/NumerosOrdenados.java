package list.Ordenacao.ordenacao;

public class NumerosOrdenados {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(100);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(44);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(65);
        ordenacaoNumeros.adicionarNumero(7);

        ordenacaoNumeros.exibirNumeros();

        System.out.println("Exibindo números em ordem ascendente " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Exibindo números em ordem descendente " + ordenacaoNumeros.ordenarDescendente());
    }
}
