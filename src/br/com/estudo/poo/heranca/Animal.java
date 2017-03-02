package br.com.estudo.poo.heranca;

public abstract class Animal {
   protected Double peso;
   protected String comida;
   
   public Animal(Double peso, String comida){
     this.peso = peso;
     this.comida = comida;
   }
   
   void dormir(){System.out.println("Dormiu");}
   abstract void fazerBarulho();
   
}
