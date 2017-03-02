
package br.com.estudo.poo.heranca;

public class Cachorro extends Animal{

  public Cachorro(Double peso, String comida) {
    super(peso, comida);
  }
  public Cachorro() {
    super(new Double(30), "Ração");
  }

  @Override
  void fazerBarulho() {
    System.out.println("au au");
  }
  
}
