package br.com.estudo.colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

  public static void main(String[] args) {
     
     List<String> list = new ArrayList();
     list.add("futebol");
     list.add("baquete");
     list.add("tênis");
     list.add("volei");
     list.add("natação");
     list.add("hokey");
     list.add("boxe");
     list.add("futebol");
     
     System.out.println(list);
     
     for(int i = 0; i < list.size(); i++){
       String letra = list.get(i);
       list.set(i, letra.toUpperCase());
     }
     System.out.println(list);
     System.out.println("Posição do boxe: "+list.indexOf("BOXE"));
     System.out.println("Posicao 2 a 4: " + list.subList(2, 4));
     list.subList(2, 4).clear();
     System.out.println("Removendo 2 a 4: " + list);
  }
  
}
