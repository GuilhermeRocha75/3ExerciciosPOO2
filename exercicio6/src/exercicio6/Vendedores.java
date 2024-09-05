package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Vendedores {
    
    private String nome;
    private List<Carros> carrosVendidos;

    // Construtor
    public Vendedores(String nome) {
        this.nome = nome;
        this.carrosVendidos = new ArrayList<>(); // Inicializando a lista
    }

    // Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carros> getCarrosVendidos() {
        return carrosVendidos;
    }

    public void setCarrosVendidos(List<Carros> carrosVendidos) {
        this.carrosVendidos = carrosVendidos;
    }
    
    // Método para vender um carro
    public void venderCarro(Carros carro) {
        if (carro != null && carro.getMarca() != null) {
            carrosVendidos.add(carro);
            System.out.println("Carro vendido: " + carro.getModelo() + " por " + nome);
        } else {
            System.out.println("Erro: Carro ou marca não pode ser null.");
        }
    }

    // Método para exibir os carros vendidos
    public void exibirCarrosVendidos() {
        System.out.println("Carros vendidos por " + nome + ":");
        for (Carros carro : carrosVendidos) {
            if (carro.getMarca() != null) {
                System.out.println("- " + carro.getModelo() + " (" + carro.getMarca().getNome() + ") - R$" + carro.getPreco());
            } else {
                System.out.println("- " + carro.getModelo() + " (Marca não especificada) - R$" + carro.getPreco());
            }
        }
    }
}
