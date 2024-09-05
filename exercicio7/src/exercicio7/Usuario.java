/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;


import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestado();
        System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
    }
}
