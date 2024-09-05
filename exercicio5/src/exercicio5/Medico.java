/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.ArrayList;

public class Medico {

    private String nome;
    private String especialidade;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Consulta> consultas;

    // Acessores

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.pacientes = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    
    public void adicionarPaciente(Paciente paciente){
        pacientes.add(paciente);
        
    }
    
    public void listarPaciente(){
        System.out.println("Pacientes do Dr(a). " + nome + ":");
        for (Paciente paciente : pacientes) {
            System.out.println("- " + paciente.getNome());
        }
        
    }
    public void agendarConsulta(Consulta consulta){
        consultas.add(consulta);
        
    }
    public void listarConsulta(){
         System.out.println("Próximas consultas do Dr(a). " + nome + ":");
        for (Consulta consulta : consultas) {
            System.out.println("- Consulta com " + consulta.getPaciente().getNome() + " na data " + consulta.getData());
        }
        
    }
    
    
    
}
