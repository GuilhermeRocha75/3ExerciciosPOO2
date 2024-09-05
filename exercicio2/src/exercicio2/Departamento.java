/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    // Construtor
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para adicionar funcionário ao departamento
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " adicionado ao departamento " + nome);
    }

    // Método para calcular a média salarial do departamento
    public double calcularMediaSalarial() {
        double soma = 0;
        for (Funcionario funcionario : funcionarios) {
            soma += funcionario.getSalario();
        }
        return (funcionarios.size() > 0) ? soma / funcionarios.size() : 0;
    }
}