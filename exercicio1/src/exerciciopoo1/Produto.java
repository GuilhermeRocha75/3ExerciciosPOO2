
package exerciciopoo1;

public class Produto {
    private String nome;
    private int quantidade;
    private int preco;
    
    //construtor

    public Produto(String nome, int quantidade, int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    
        //setter e getters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreco() {
        return preco;
    }


    public void setPreco(int preco) {
        this.preco = preco;
    }

    
    
    
    public void exibirInfo() {
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade: "+quantidade);
    }
    
}
