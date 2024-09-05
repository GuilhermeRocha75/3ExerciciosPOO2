/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio6 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //marcas
        Marcas marcaToyota = new Marcas("Toyota");
        Marcas marcaHonda = new Marcas("Honda");
        
        // Criando carros
        Carros carro1 = new Carros("Corolla", 90000, marcaToyota);
        Carros carro2 = new Carros("Civic", 95000, marcaHonda);
          Carros carro3 = new Carros("Supra", 75000, marcaToyota);
     
        
        // Adicionando carros ao estoque
        Carros.adicionarCarroAoEstoque(carro1);
        Carros.adicionarCarroAoEstoque(carro2);
         Carros.adicionarCarroAoEstoque(carro3);
     
         carro1.Separador();
         
         
        // Calculando média de preços por marca
        double mediaToyota = Carros.calcularMediaPrecoPorMarca(marcaToyota);
        System.out.println("Média de preços para Toyota: R$" + mediaToyota);
        
         carro1.Separador();
        
        // Criando vendedor e registrando vendas
        Vendedores vendedor = new Vendedores("João");
        vendedor.venderCarro(carro1);
        vendedor.venderCarro(carro2);
        
         carro1.Separador();
        
        // Exibindo carros vendidos pelo vendedor
        vendedor.exibirCarrosVendidos();
    
    }
    
}
