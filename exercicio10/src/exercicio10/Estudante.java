package exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private List<Disciplina> disciplinas;

    public Estudante(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public double calcularMedia() {
        double soma = 0;
        int totalNotas = 0;

        for (Disciplina disciplina : disciplinas) {
            soma += disciplina.getNota();
            totalNotas++;
        }

        return totalNotas > 0 ? soma / totalNotas : 0;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}
