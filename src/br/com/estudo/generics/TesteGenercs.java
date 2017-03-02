package br.com.estudo.generics;

public class TesteGenercs {
  
  public static void main(String[] args){
  ExemploGenerico<String> exemplo = new ExemploGenerico<>();
  
  exemplo.setElemento("teste");
  
    System.out.println(exemplo.getElemento());
  }
}
