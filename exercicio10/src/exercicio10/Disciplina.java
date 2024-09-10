package exercicio10;

public class Disciplina {
    private String nome;
    private Professor professor;
    private double nota;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.nota = 0.0; // Inicializando a nota como 0
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
