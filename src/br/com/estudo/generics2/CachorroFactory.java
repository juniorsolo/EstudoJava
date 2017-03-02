

package br.com.estudo.generics2;

public class CachorroFactory extends AnimalFactory<Cachorro>{
  

  public static Cachorro Create(){
    return new Cachorro();
  }
  
}
