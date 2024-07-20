package list.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item items : itemList) {
                if (items.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(items);
                }
            }
         itemList.removeAll(itemParaRemover);
        }else{
        System.out.println("A lista esta vazia!");
       }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item items : itemList) {
                double valorItem = items.getPreco() * items.getQuanridade();
                valorTotal += valorItem;

            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else{
            System.out.println("A lista esta vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList = " + itemList +
                '}';
    }
}
