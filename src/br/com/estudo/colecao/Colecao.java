package br.com.estudo.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

  public static void main(String[] args) {
    Collection<String> c = new ArrayList<>();
    c.add("a");
    c.add("e");
    c.add("i");
    System.out.println(c.toString());
    System.out.println(c.isEmpty());
    System.out.println(c.contains("a"));
    
    c.remove("a");
    System.out.println(c.toString());
    
    /*  Grupos  */
    
    Collection<String> c2 = Arrays.asList("o","u");
    c.addAll(c2); // recebe outra coleção    
    System.out.println(c.toString());
    System.out.println(c.containsAll(c2)); //verifica se existem todos esse elementos
    c.removeAll(c2);
    System.out.println(c.toString());
    
    
    /* Percorrer os elementos*/
    for(String string : c){
      System.out.println(string);
    }
    String[] s = c.toArray(new String[c.size()]);
    System.out.println("Covertido: "+Arrays.toString(s));
    
    c.clear();
    System.out.println("Limpa coleção: " + c);
  }
  
}
