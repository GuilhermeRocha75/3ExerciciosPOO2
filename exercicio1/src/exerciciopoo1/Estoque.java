
package exerciciopoo1;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;
    
    // Construtor
    public Estoque() {
        produtos = new ArrayList<>();
    }
    
    // Método para adicionar produto ao estoque
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado ao estoque: " + produto.getNome());
    }
    
    // Método para listar produtos com estoque baixo
    public void listarProdutosComEstoqueBaixo(int limite) {
        System.out.println("Produtos com estoque baixo (menos de " + limite + " unidades):");
        for (Produto produto : produtos) {
            if (produto.getQuantidade() < limite) {
                produto.exibirInfo();
                System.out.println("----------------------------");
            }
        }
    }
}