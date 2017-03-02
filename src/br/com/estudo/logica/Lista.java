
package br.com.estudo.logica;

import java.util.ArrayList;

public class Lista {
  
  public static void main(String[] args){
    ArrayList<String> cores = new ArrayList<>();
    cores.add("Branco");
    cores.add(0, "Vermelho"); // troca de posição com o elemento
    cores.add("Verde");
    cores.add("Amarelo");
    cores.add("Azul");
    System.out.println("Emementos: " + cores.toString());
    System.out.println("Tamanho: " + cores.size());
    System.out.println("Posicao 2: " + cores.get(2));
    System.out.println("Posicao do Amarelo: " + cores.indexOf("Amarelo"));// retorna -1 caso não encontre
    
    cores.remove("Verde");
    System.out.println("Emementos: " + cores.toString());
    System.out.println("Tem amarelo? " + cores.contains("Amarelo"));
  }
  
}
