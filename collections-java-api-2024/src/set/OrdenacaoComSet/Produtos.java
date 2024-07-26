package set.OrdenacaoComSet;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return getCodigo() == produtos.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "codigo = " + codigo +
                ", nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                '}';
    }
}
class ComparatorPorPreco implements Comparator<Produtos>{

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
class ComparatorPorQuantidade implements Comparator<Produtos>{

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
    }
}
