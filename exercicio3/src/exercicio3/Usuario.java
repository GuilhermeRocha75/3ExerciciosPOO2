package exercicio3;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Postagem> postagens;

    // Construtor
    public Usuario(String nome) {
        this.nome = nome;
        this.postagens = new ArrayList<>();
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para criar uma nova postagem
    public void criarPostagem(String conteudo) {
        Postagem postagem = new Postagem(conteudo, this);
        postagens.add(postagem);
        System.out.println("Postagem criada por " + nome + ": " + conteudo);
    }

    // Método para listar as postagens do usuário
    public void listarPostagens() {
        System.out.println("Postagens de " + nome + ":");
        for (Postagem postagem : postagens) {
            postagem.exibirPostagem();
        }
    }

    // Método para obter as postagens do usuário
    public ArrayList<Postagem> getPostagens() {
        return postagens;
    }
}
