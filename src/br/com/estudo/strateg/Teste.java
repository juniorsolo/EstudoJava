package br.com.estudo.strateg;


public class Teste {

  public static void main(String[] args) {
    Conta conta = new Conta();
    conta.setX(12.0);
    conta.setY(12.0);    
    System.out.print(conta.calculo.conta(conta.getX(), conta.getY()));
    
  }
  
}
