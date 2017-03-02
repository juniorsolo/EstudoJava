
package br.com.estudo.generics;

public class ExemploGenerico <e> {
  
  e elemento;
  
  public void setElemento(e elemento){
    this.elemento = elemento;
  }
  
  public Object getElemento(){
    return elemento;
  }
  
}
