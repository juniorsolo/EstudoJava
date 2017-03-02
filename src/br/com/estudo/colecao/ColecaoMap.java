package br.com.estudo.colecao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

  public static void main(String[] args) {

    Map<String, String> pais = new HashMap<String, String>();
    pais.put("BR", "Brasil");
    pais.put("RU", "Russia");
    pais.put("IN", "Índia");
    pais.put("CN", "China");
    System.out.println(pais); 
    System.out.println("Existe key: " + pais.containsKey("BR"));
    System.out.println("Existe value: " + pais.containsValue("Russia"));
    System.out.println("Existe value: " + pais.containsValue("Japão"));
    System.out.println("Value pela key: " + pais.get("IN")); 
    pais.remove("CN");
    System.out.println("Removendo value: " + pais);
    
    Set<String> keys = pais.keySet();
    
    for(String key : keys){
      System.out.println(key +" " +pais.get(key));
    }
    
  }
}
