package list.Exercicio2;

public class Teste {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(25);
        ordenacaoNumeros.adicionarNumero(35);
        ordenacaoNumeros.adicionarNumero(75);
        ordenacaoNumeros.adicionarNumero(105);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());
//
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
