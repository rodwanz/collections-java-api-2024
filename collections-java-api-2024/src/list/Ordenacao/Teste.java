package list.Ordenacao;

public class Teste {
    public static void main(String[] args) {
        OrdenacaoPessoas op = new OrdenacaoPessoas();

        op.adicionarPessoa("Miguel", 18, 1.74);
        op.adicionarPessoa("Sophia", 16, 1.71);
        op.adicionarPessoa("Maria Eduarda", 19, 1.83);
        op.adicionarPessoa("Felipe", 34, 1.76);
        op.adicionarPessoa("Rachel", 42, 1.77);
        op.adicionarPessoa("Rodrigo", 45, 1.73);
        op.adicionarPessoa("Elena", 5, 1.40);
        op.adicionarPessoa("Lucas", 29, 1.84);

//        System.out.println(op.ordenarPorIdade());
        System.out.println(op.aordenarPorAltura());
    }
}
