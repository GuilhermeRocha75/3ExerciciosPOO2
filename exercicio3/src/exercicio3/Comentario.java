package exercicio3;

public class Comentario {
    private String texto;
    private Usuario autor;

    // Construtor
    public Comentario(String texto, Usuario autor) {
        this.texto = texto;
        this.autor = autor;
    }

    // Métodos acessores
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    // Método para exibir o comentário
    public void exibirComentario() {
        System.out.println("Comentário de " + autor.getNome() + ": " + texto);
    }
}
