
package exerciciopoo1;


public class Fornecedor {
    
    private String nome;
    private String contato;
    
    //construtor

    public Fornecedor(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

//getters e setters 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }


public void exibirInfo(){
    System.out.println("Nome do fornecedor: "+nome);
    System.out.println("contato do fornecedor: "+contato);
}    
    
}
