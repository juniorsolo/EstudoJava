package br.com.estudo.refinado;

public class Aninhamento {
   
  public void executa(){
        System.out.println("Executando classe envolvente"); 
     }
  
  public class ClasseAninhada{
    
     public void executa(){
        System.out.println("Executando classe aninhada"); 
     }
  } 
  
  public static void main(String[] args) {
     Aninhamento aninhamento = new Aninhamento();
     aninhamento.executa();
     Aninhamento.ClasseAninhada classeAninhada = 
         aninhamento.new ClasseAninhada();
     classeAninhada.executa();
     
  }
  
}
