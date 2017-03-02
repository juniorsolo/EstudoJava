

package br.com.estudo.poo.heranca;

public class Galinha extends Ave{

  public Galinha() {
    super(new Double(8), "milho");
  }

  @Override
  void fazerBarulho() {
    System.out.println("có, có");
  }
  
}
