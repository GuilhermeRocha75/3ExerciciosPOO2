
package exerciciopoo1;


public class Pedido {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;
    
    //construtor

    public Pedido(Produto produto, Fornecedor fornecedor, int quantidade) {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }
    
    //setter e getter

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void exibirInfo(){
        System.out.println("Pedido: ");
        produto.exibirInfo();
        fornecedor.exibirInfo();
        System.out.println("Quantidade do pedido: "+ quantidade);
    }
}
