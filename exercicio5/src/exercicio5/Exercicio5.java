/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Date;


/**
 *
 * @author aluno.saolucas
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //medico
        Medico medico1 = new Medico("Pedro Souza", "Pediatra");
        
        
        //pacinetes
        Paciente paciente1 = new Paciente("Maria Silva", "000.000.000-00");
        Paciente paciente2 = new Paciente("Carlos Pereira", "123.456.789-10");

        //adicionando pacientes aos medicos
        medico1.adicionarPaciente(paciente1);
        medico1.adicionarPaciente(paciente2);

        //consultas
        Consulta consulta1 = new Consulta(paciente1, medico1, new Date());
        Consulta consulta2 = new Consulta(paciente2, medico1, new Date());

        medico1.agendarConsulta(consulta1);
        medico1.agendarConsulta(consulta2);

        //pacientes do medico
        medico1.listarPaciente();

        //consultas do medico
        medico1.listarConsulta();
    }
    
}
