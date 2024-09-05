/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno.saolucas
 */

public class Exercicio2 {
    
    
    public void separador(){
        System.out.println("========================================================");
}
    
    
    
    public static void main(String[] args) {
        // Criando separador
        Exercicio2 s = new Exercicio2();
        
        
          // Criando departamentos
        Departamento ti = new Departamento("TI");
        Departamento rh = new Departamento("RH");

        // Criando funcionarios
        Funcionario f1 = new Funcionario("Carlos", 5000);
        Funcionario f2 = new Funcionario("Ana", 4000);
        Funcionario f3 = new Funcionario("Pedro", 6000);

        // Adicionando funcionarios aos departamentos
        ti.adicionarFuncionario(f1);
        ti.adicionarFuncionario(f3);
        rh.adicionarFuncionario(f2);

        s.separador();
        
        // Criando projetos
        Projeto p1 = new Projeto("Desenvolvimento de Sistema", "Sistema de gestão empresarial");
        Projeto p2 = new Projeto("Reestruturação de Rede", "Atualização da infraestrutura de TI");
        Projeto p3 = new Projeto("Recrutamento", "Processo seletivo para novas vagas");

     
        
        // Atribuindo projetos aos funcionarios
        f1.atribuirProjeto(p1);
        f1.atribuirProjeto(p2);
        f2.atribuirProjeto(p3);
        f3.atribuirProjeto(p1);

        s.separador();
        
        // Exibindo projetos de um funcionario
        f1.exibirProjetos();

        s.separador();
        
        // Calculando media salarial dos departamentos
        System.out.println("Média salarial do departamento de TI: " + ti.calcularMediaSalarial());
        System.out.println("Média salarial do departamento de RH: " + rh.calcularMediaSalarial());
    
        
    }
    
}
