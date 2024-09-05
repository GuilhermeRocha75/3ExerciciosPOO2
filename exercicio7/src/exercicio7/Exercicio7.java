package exercicio7;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando autores
        Autor autor1 = new Autor("George Orwell");
        Autor autor2 = new Autor("J.K. Rowling");

        // Criando livros
        Livro livro1 = new Livro("1984", autor1);
        Livro livro2 = new Livro("Harry Potter", autor2);
        Livro livro3 = new Livro("Animal Farm", autor1);

        // Criando usuários
        Usuario usuario1 = new Usuario("Claudia");
        Usuario usuario2 = new Usuario("Joao");

        // Criando lista de empréstimos
        List<Emprestimo> emprestimos = new ArrayList<>();

        // Realizando empréstimos
        usuario1.emprestarLivro(livro1);
        emprestimos.add(new Emprestimo(livro1, usuario1));

        usuario2.emprestarLivro(livro2);
        emprestimos.add(new Emprestimo(livro2, usuario2));

        // Devolução com cálculo de multa
        Emprestimo emprestimo1 = emprestimos.get(0);
        emprestimo1.devolver();
        System.out.println("Multa: R$" + emprestimo1.calcularMulta());

        // Listando livros mais populares
        listarLivrosMaisPopulares(Arrays.asList(livro1, livro2, livro3));
    }

    public static void listarLivrosMaisPopulares(List<Livro> livros) {
        System.out.println("Livros mais populares:");
        livros.sort((l1, l2) -> Integer.compare(l2.getVezesEmprestado(), l1.getVezesEmprestado())); // Ordenando por popularidade
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getVezesEmprestado() + " empréstimos");
        }
    }
}
