package br.com.estudo.poo;

public class EnumeracaoTest {
  public static void main(String[] args){
  
    System.out.println(PecasXadrez.BISPO);
    System.out.println(Medida.M.titulo);
    
    for(Medida m : Medida.values()){
      System.out.println(m +" : "+ m.titulo);
    }
  }
}
