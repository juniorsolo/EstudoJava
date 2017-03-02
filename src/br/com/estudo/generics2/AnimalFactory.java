

package br.com.estudo.generics2;

public abstract class AnimalFactory<Value> extends Animal{
   
  public static Animal create(){
      return new Animal();
  }
}
