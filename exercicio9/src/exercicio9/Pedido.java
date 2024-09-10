package exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa mesa;
    private List<Prato> pratos;

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }
}
