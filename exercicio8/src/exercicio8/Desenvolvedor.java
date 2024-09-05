package exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
    private String nome;
    private List<Tarefa> tarefas;

    public Desenvolvedor(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void listarTarefas() {
        System.out.println("Tarefas de " + nome + ":");
        for (Tarefa tarefa : tarefas) {
            System.out.println("- " + tarefa.getDescricao() + " (" + tarefa.getCargaHoraria() + " horas)");
        }
    }
}
