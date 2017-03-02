
package br.com.estudo.hook.method;


public abstract class AbstractMensagem {
  
  
  public final void principal(){
    System.out.println("executando metodo principal");
    
    subMetodo();
  }
  
  public void subMetodo(){
    System.out.println("executando sub metodo principal");    
  }
  
}
