/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;


public class Exercicio3 {

  
    public static void main(String[] args) {
   // Criando usuários
        Usuario usuario1 = new Usuario("Alice");
        Usuario usuario2 = new Usuario("Bob");

        // Criando postagens
        usuario1.criarPostagem("Olá, mundo!");
        usuario1.criarPostagem("Meu primeiro post!");

        // Listando postagens do usuário
        usuario1.listarPostagens();

        // Obtendo a primeira postagem de Alice
        Postagem postagem = usuario1.getPostagens().get(0);

        // Comentando na postagem
        postagem.comentar("Muito legal!", usuario2);

        // Listando postagens de Alice novamente para ver o comentário
        usuario1.listarPostagens();
    }
}