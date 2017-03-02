
package br.com.estudo.poo;

public class Galinha {
  public static Integer ovosDaGranja = 0;
  public Integer ovos = 0;
  
  public Galinha botar(){
    this.ovos++;
    Galinha.ovosDaGranja++;
    return this;
  }
  
  public static double mediaOvos(int galinhas){
    return ovosDaGranja / galinhas;
  }
}
