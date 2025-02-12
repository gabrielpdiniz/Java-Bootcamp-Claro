package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }


    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }


    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }


    public double calcularValorTotalEstoque() {
        double calcularValorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                calcularValorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return calcularValorTotalEstoque;
    }


    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }


    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto 1", 10, 100.0);
        estoque.adicionarProduto(2L, "Produto 2", 15, 53.0);
        estoque.adicionarProduto(3L, "Produto 3", 7, 71.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
    }
}
