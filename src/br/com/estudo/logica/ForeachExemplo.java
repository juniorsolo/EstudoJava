
package br.com.estudo.logica;

import java.util.ArrayList;

public class ForeachExemplo {
  
  public static void main(String[] Args){
    ArrayList<Integer> list = new ArrayList<>();
    
    for(int i=0; i<10;i++){
      list.add(i);
    } 
    for(Integer valor : list){
       System.out.println(valor);
    }
    
  }
}
