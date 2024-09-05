package exercicio4;

public class Voo {
    private String numeroVoo;
    private int capacidade;
    private int lugaresDisponiveis;

    public Voo(String numeroVoo, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.capacidade = capacidade;
        this.lugaresDisponiveis = capacidade;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public int getLugaresDisponiveis() {
        return lugaresDisponiveis;
    }

    // Método para verificar se há disponibilidade no voo
    public boolean verificarDisponibilidade() {
        return lugaresDisponiveis > 0;
    }

    // Método para reduzir o número de lugares disponíveis
    public void reservarLugar() {
        if (verificarDisponibilidade()) {
            lugaresDisponiveis--;
        } else {
            System.out.println("Voo " + numeroVoo + " lotado.");
        }
    }
}
