
package exerciciopoo1;


public class Exercicio1 {

    public static void main(String[] args) {
      
        Produto p1 = new Produto("Iphone 14", 5, 8500);
        Produto p2 = new Produto("Samsung Galaxy S22", 2, 7500);
        
  
        Fornecedor f1 = new Fornecedor("Apple", "apple@empresa.com");
        Fornecedor f2 = new Fornecedor("Samsung", "samsung@empresa.com");
        
      
        Pedido pedido1 = new Pedido(p1, f1, 10);
        Pedido pedido2 = new Pedido(p2, f2, 15);
        
     
        Estoque estoque = new Estoque();
        
      
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        
    
        estoque.listarProdutosComEstoqueBaixo(3);
    }
    
}
