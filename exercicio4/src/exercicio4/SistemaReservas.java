package exercicio4;

import java.util.ArrayList;

public class SistemaReservas {
    private ArrayList<Voo> voos;

    public SistemaReservas() {
        this.voos = new ArrayList<>();
    }

    // Método para adicionar um voo ao sistema
    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    // Método para reservar um lugar em um voo
   // Método para fazer uma reserva
    public void fazerReserva(Passageiro passageiro, Voo voo) {
        if (voo.verificarDisponibilidade()) {
            voo.reservarLugar();  // Reduz o número de lugares disponíveis no voo
            Reserva reserva = new Reserva(passageiro, voo);
            passageiro.adicionarReserva(reserva);  // Adiciona a reserva ao passageiro
            System.out.println("Reserva realizada para o passageiro " + passageiro.getNome() + " no voo " + voo.getNumeroVoo());
        } else {
            System.out.println("Não há disponibilidade no voo " + voo.getNumeroVoo());
        }
    }
}
