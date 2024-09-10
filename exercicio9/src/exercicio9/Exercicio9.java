package exercicio9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    private static List<Pedido> pedidos = new ArrayList<>();
    private static List<Mesa> reservas = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        // Criando mesas
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        // Criando pratos
        Prato prato1 = new Prato("Spaghetti", 30.50);
        Prato prato2 = new Prato("Lasanha", 45.00);
        Prato prato3 = new Prato("Salada Caesar", 20.00);

        // Criando um pedido para a mesa 1
        Pedido pedido1 = new Pedido(mesa1);
        pedido1.adicionarPrato(prato1);
        pedido1.adicionarPrato(prato2);

        // Exibindo o total do pedido
        System.out.println("Total do pedido da mesa " + mesa1.getNumero() + ": R$ " + pedido1.calcularTotal());

        // Adicionando o pedido à lista de pedidos
        pedidos.add(pedido1);

        // Criando uma reserva para mesa 2
        System.out.println("Digite a data e hora da reserva para a mesa 2 (dia/mes/ano Hora:min): ");
        String dataHora = scanner.nextLine();
        Date dataReserva = sdf.parse(dataHora);

        // Adicionando a reserva (guardamos a mesa como exemplo)
        reservas.add(mesa2);
        System.out.println("Mesa " + mesa2.getNumero() + " reservada para: " + dataReserva);

        // Exibindo as reservas
        System.out.println("\nReservas futuras:");
        for (Mesa reserva : reservas) {
            System.out.println("Mesa: " + reserva.getNumero());
        }
    }
}
