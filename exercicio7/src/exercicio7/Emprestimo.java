/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private final int DIAS_PARA_DEVOLUCAO = 7;
    private final double MULTA_POR_DIA = 2.5;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = LocalDate.now();
    }

    public void devolver() {
        this.dataDevolucao = LocalDate.now();
    }

    public double calcularMulta() {
        if (dataDevolucao == null) {
            return 0;
        }
        long diasAtraso = ChronoUnit.DAYS.between(dataEmprestimo.plusDays(DIAS_PARA_DEVOLUCAO), dataDevolucao);
        if (diasAtraso > 0) {
            return diasAtraso * MULTA_POR_DIA;
        }
        return 0;
    }
}

