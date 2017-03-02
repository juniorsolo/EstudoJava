package br.com.estudo.hook.method;

public class Main {

  public static void main(String[] args) {
    SubClasseA subA = new SubClasseA();  
    SubClasseB subB = new SubClasseB();   
    SubClasseC subC = new SubClasseC(); 
    // Nesse caso o submetodo executado e da subA aou invés da AbstractMensagem
    subA.principal();
    subB.principal();
    
    //executando metodos da abstract
    subC.principal();
  }
  
}
