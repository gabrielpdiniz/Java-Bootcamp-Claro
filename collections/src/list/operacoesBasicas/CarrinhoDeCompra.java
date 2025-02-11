package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }  


    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }


    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item t : itemList){
            if(t.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(t);
            }
        }
    }


    public void exibirItens(){
        System.out.println(itemList);
    }


    public void obterValorTotal(){
        double valorTotal = 0;
        for(Item i : itemList){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println("O valor total da compra é: " + valorTotal);
    }
}
