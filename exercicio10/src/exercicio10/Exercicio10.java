package exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando professores
        Professor prof1 = new Professor("Professor João");
        Professor prof2 = new Professor("Professor Maria");

        // Criando disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", prof1);
        Disciplina disciplina2 = new Disciplina("História", prof2);

        // Associando disciplinas aos professores
        prof1.adicionarDisciplina(disciplina1);
        prof2.adicionarDisciplina(disciplina2);

        // Criando estudante
        Estudante estudante = new Estudante("Ana");

        // Matriculando estudante nas disciplinas
        estudante.matricularDisciplina(disciplina1);
        estudante.matricularDisciplina(disciplina2);

        // Definindo notas para o estudante
        System.out.println("Digite a nota em " + disciplina1.getNome() + ":");
        double notaMatematica = scanner.nextDouble();
        disciplina1.setNota(notaMatematica); // Agora apenas define a nota

        System.out.println("Digite a nota em " + disciplina2.getNome() + ":");
        double notaHistoria = scanner.nextDouble();
        disciplina2.setNota(notaHistoria); // Define a nota para a disciplina

        // Calculando a média do estudante
        double media = estudante.calcularMedia();
        System.out.println("Média do estudante " + estudante.getNome() + ": " + media);

        // Listando as disciplinas de um professor
        System.out.println("Disciplinas ministradas por " + prof1.getNome() + ":");
        for (Disciplina disciplina : prof1.listarDisciplinas()) {
            System.out.println(disciplina.getNome());
        }
    }
}
