package exercicio2;


import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private double salario;
    private ArrayList<Projeto> projetos;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para atribuir projeto ao funcionário
    public void atribuirProjeto(Projeto projeto) {
        projetos.add(projeto);
        System.out.println("Projeto " + projeto.getNome() + " atribuído a " + nome);
    }

    // Método para exibir projetos do funcionário
    public void exibirProjetos() {
        System.out.println("Projetos de " + nome + ":");
        for (Projeto projeto : projetos) {
            System.out.println("- " + projeto.getNome());
        }
    }
}