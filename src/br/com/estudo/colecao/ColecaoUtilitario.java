package br.com.estudo.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class ColecaoUtilitario {

  public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("Guaraná");
    list.add("Uva");
    list.add("Manga");
    list.add("Coco");
    list.add("Açaí");
    list.add("Banana");
    System.out.println(list);
    //lista ordenada
    Collections.sort(list);
    System.out.println(list);
    
    //lista ordenada de forma reversa
    Collections.reverse(list);
    System.out.println(list);
    
    //embaralhamento da coleção
    Collections.shuffle(list);
    System.out.println(list);
    
    // adicionando mais elementos na coleção
    Collections.addAll(list,"Cupuaçu","Laranja","Laranja");
    System.out.println(list);
    System.out.println("Vezes que aparece Laranja: " + Collections.frequency(list, "Laranja"));
    
    List<String> list2 = Arrays.asList("Acerola","Graviola");
    boolean d =   Collections.disjoint(list, list2);//verifica se a list possue os elementos da list2
    System.out.println(d);
    
    Collections.sort(list);
    System.out.println(list);
    int i = Collections.binarySearch(list,"Guaraná"); // pesquisa e retorna o indice
    System.out.println("posição do Guaraná: " + i); 
    
    Collections.fill(list, "Açaí"); ///inseri o objeto em todas as posições
    System.out.println(list);
    
    //coleção não modificável
    Collection<String> constante = Collections.unmodifiableCollection(list); // transforma em uma coleção não modificavél, vira uma constante
    System.out.println(constante);
  }
  
}
