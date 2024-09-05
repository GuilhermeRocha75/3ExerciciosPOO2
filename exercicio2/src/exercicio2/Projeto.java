package exercicio2;

public class Projeto {
    private String nome;
    private String descricao;

    // Construtor
    public Projeto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
