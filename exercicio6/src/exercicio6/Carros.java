/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aluno.saolucas
 */
public class Carros {
    
    private String Modelo;
    private  double preco;
    private Marcas marca;
    
    //acessores

    public Carros(String Modelo, double preco, Marcas marca) {
        this.Modelo = Modelo;
        this.preco = preco;
        this.marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }

    public static List<Carros> getEstoque() {
        return estoque;
    }

    public static void setEstoque(List<Carros> estoque) {
        Carros.estoque = estoque;
    }

    
    
    // Lista de estoque de carros
    public static List<Carros> estoque = new ArrayList<>();
    
    // Método para adicionar carros ao estoque
    public static void adicionarCarroAoEstoque(Carros carro) {
        estoque.add(carro);
        System.out.println("Carro adicionado: " + carro.getModelo());
    }
    
    // Método para calcular a média de preços de carros por marca
    public static double calcularMediaPrecoPorMarca(Marcas marca) {
        double soma = 0;
        int quantidade = 0;
        for (Carros carro : estoque) {
            if (carro.getMarca().equals(marca)) {
                soma += carro.getPreco();
                quantidade++;
            }
        }
        if (quantidade > 0) {
            return soma / quantidade;
        } else {
            System.out.println("Nenhum carro encontrado para a marca " + marca.getNome());
            return 0;
        }
    }
    
        // Separador 
    public void Separador(){
        System.out.println("----------------------------");
    }
    
}
