package br.com.estudo.threads;

public class PonteTeste {

  public static void main(String[] args) {
    Ponte ponte = new PonteSincronizada();
    Ponte ponte2 = new PonteSincronizada();
    new Thread(new Produtor(ponte)).start();
    new Thread(new Consumidor(ponte)).start();  
    new Thread(new Produtor(ponte2)).start();
    new Thread(new Consumidor(ponte2)).start();
    
  }
  
}
