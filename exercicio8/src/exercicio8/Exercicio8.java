/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;
 import java.util.List;
/**
 *
 * @author aluno.saolucas
 */
public class Exercicio8 {

    public static void main(String[] args) {
        // Criando desenvolvedores
        Desenvolvedor dev1 = new Desenvolvedor("Joao");
        Desenvolvedor dev2 = new Desenvolvedor("Pedro");

        // Criando tarefas
        Tarefa tarefa1 = new Tarefa("Programação", 12);
        Tarefa tarefa2 = new Tarefa("Design", 5);
        Tarefa tarefa3 = new Tarefa("Teste de códigos", 10);

        // Criando projeto
        Projeto projeto = new Projeto("Sistema de Gerenciamento");

        // Adicionando tarefas ao projeto
        projeto.adicionarTarefa(tarefa1);
        projeto.adicionarTarefa(tarefa2);
        projeto.adicionarTarefa(tarefa3);

        // Adicionando desenvolvedores ao projeto
        projeto.adicionarDesenvolvedor(dev1);
        projeto.adicionarDesenvolvedor(dev2);

        // Atribuindo tarefas aos desenvolvedores
        dev1.adicionarTarefa(tarefa1);
        dev1.adicionarTarefa(tarefa3);
        dev2.adicionarTarefa(tarefa2);

        // Calculando carga de trabalho do projeto
        double cargaTrabalho = projeto.calcularCargaDeTrabalho();
        System.out.println("Carga total de trabalho do projeto: " + cargaTrabalho + " horas");

        // Listando tarefas de um desenvolvedor
        dev1.listarTarefas();
    }
}

    

