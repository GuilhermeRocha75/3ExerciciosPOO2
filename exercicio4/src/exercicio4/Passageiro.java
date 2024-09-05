package exercicio4;

import java.util.ArrayList;

public class Passageiro {
    private String nome;
    private ArrayList<Reserva> reservas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    // Método para adicionar uma reserva ao passageiro
    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);  // Adiciona a reserva à lista de reservas do passageiro
    }

    // Método para listar as reservas do passageiro
    public void listarReservas() {
        System.out.println("Reservas do passageiro " + nome + ":");
        for (Reserva reserva : reservas) {
            System.out.println("Voo: " + reserva.getVoo().getNumeroVoo());
        }
    }
    
    // Separador 
    public void Separador(){
        System.out.println("----------------------------");
    }
}
