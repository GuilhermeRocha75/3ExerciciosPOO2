package exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Tarefa> tarefas;
    private List<Desenvolvedor> desenvolvedores;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
        this.desenvolvedores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
        desenvolvedores.add(desenvolvedor);
    }

    public double calcularCargaDeTrabalho() {
        double cargaTotal = 0;
        for (Tarefa tarefa : tarefas) {
            cargaTotal += tarefa.getCargaHoraria();
        }
        return cargaTotal;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }
}
