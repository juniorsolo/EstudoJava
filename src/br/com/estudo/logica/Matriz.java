package br.com.estudo.logica;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matriz {
  
public static void main(String[] args){
  
  String[] uma ={"joao","pedro","maria","a","b","f"};
  System.out.println(uma.length);
  System.out.println(Arrays.toString(uma));
  int posicao = Arrays.binarySearch(uma,"joao"); //
  System.out.println(posicao);
  Arrays.sort(uma,0, uma.length);
 System.out.println(Arrays.toString(uma));
  
  
}  
  
}
