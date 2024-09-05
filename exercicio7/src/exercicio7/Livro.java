/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor;
    private int vezesEmprestado;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.vezesEmprestado = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getVezesEmprestado() {
        return vezesEmprestado;
    }

    public void emprestado() {
        vezesEmprestado++;
    }
}