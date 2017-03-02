package br.com.estudo.poo.heranca;



public class HerancaTest {
 
  public static void main(String[] args){
    
     Animal dog = new Cachorro();
     dog.fazerBarulho();
     dog.dormir();
     
     Animal g = new Galinha();
     ((Galinha)g).botaOvos();  // converte o animal em galinha para usar o metodo
     g.dormir();
     
     System.out.println("galinha: " + (g instanceof Galinha));
     System.out.println("Ave: " + (g instanceof Ave));
     System.out.println("Animal: " + (dog instanceof Animal));
     
  }
  
}
