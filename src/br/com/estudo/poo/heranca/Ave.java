

package br.com.estudo.poo.heranca;

public abstract class Ave extends Animal{

  public Ave(Double peso, String comida) {
    super(peso, comida);
  }
  
  void voar(){System.out.println("voou");}
  void botaOvos(){System.out.println("botou ovos");}

  
}
