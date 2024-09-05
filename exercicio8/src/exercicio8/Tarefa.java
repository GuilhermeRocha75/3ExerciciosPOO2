package exercicio8;

public class Tarefa {
    private String descricao;
    private double cargaHoraria;

    public Tarefa(String descricao, double cargaHoraria) {
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }
}
