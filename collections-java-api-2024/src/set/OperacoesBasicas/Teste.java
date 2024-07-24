package set.OperacoesBasicas;

public class Teste {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de Convidados");

        conjuntoConvidados.adicionarConvidado("Mirian", 2345);
        conjuntoConvidados.adicionarConvidado("Felipe", 2345);
        conjuntoConvidados.adicionarConvidado("João", 2346);
        conjuntoConvidados.adicionarConvidado("Susanne", 2347);
        conjuntoConvidados.adicionarConvidado("Rachel", 2348);
        conjuntoConvidados.adicionarConvidado("Cristina", 2349);
        conjuntoConvidados.adicionarConvidado("Pe. Robson", 234501);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(2345);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de Convidados");

        conjuntoConvidados.exibirConvidados();




    }
}
