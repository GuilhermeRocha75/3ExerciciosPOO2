package exercicio4;

public class Exercicio4 {

    
    
    
    public static void main(String[] args) {
        // Criando o sistema de reservas
        SistemaReservas sistema = new SistemaReservas();

        // Criando voos
        Voo voo1 = new Voo("Azul 556", 2);
        Voo voo2 = new Voo("Gol 665", 1);

        // Adicionando voos ao sistema
        sistema.adicionarVoo(voo1);
        sistema.adicionarVoo(voo2);

        // Criando passageiros
        Passageiro passageiro1 = new Passageiro("Alice");
        Passageiro passageiro2 = new Passageiro("Joao");

        // Fazendo reservas
        sistema.fazerReserva(passageiro1, voo1);
        sistema.fazerReserva(passageiro2, voo1); 
        sistema.fazerReserva(passageiro1, voo2);

        passageiro1.Separador();
        
        // Listando reservas de Alice
        passageiro1.listarReservas();
        
        passageiro1.Separador();
        
        // Listando reservas de Joao
        passageiro2.listarReservas();
    }
}
