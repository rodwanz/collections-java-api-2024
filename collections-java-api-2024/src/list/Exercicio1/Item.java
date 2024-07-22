package list.Exercicio1;

import list.OperacoesBasicas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double preco;
    private int quanridade;
    public Item(String nome, double preco, int quanridade) {
        this.nome = nome;
        this.preco = preco;
        this.quanridade = quanridade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuanridade() {
        return quanridade;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "nome = " + nome + '\'' +
                ", preco = " + preco +
                ", quanridade = " + quanridade +
                '}';
    }
}
