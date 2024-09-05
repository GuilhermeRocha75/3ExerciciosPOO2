package exercicio3;

import java.util.ArrayList;

public class Postagem {
    private String conteudo;
    private Usuario autor;
    private ArrayList<Comentario> comentarios;

    // Construtor
    public Postagem(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.comentarios = new ArrayList<>();
    }

    // Métodos acessores
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    // Método para adicionar um comentário à postagem
    public void comentar(String texto, Usuario usuario) {
        Comentario comentario = new Comentario(texto, usuario);
        comentarios.add(comentario);
        System.out.println("Comentário adicionado por " + usuario.getNome() + ": " + texto);
    }

    // Método para exibir a postagem e seus comentários
    public void exibirPostagem() {
        System.out.println("Postagem de " + autor.getNome() + ": " + conteudo);
        System.out.println("Comentários:");
        for (Comentario comentario : comentarios) {
            comentario.exibirComentario();
        }
        System.out.println("------------------------------");
    }
}
