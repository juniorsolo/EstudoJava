package br.com.estudo.threads;

public class PonteSincronizada implements Ponte{
  private int valor = -1;
  private boolean ocupada = false;
  
  @Override
  public synchronized void set(int valor) throws InterruptedException {
    while(ocupada){
      System.out.println("Ponte Cheia.Produtor deve aguardar");
      wait();
    }
    ocupada = true;
    notifyAll();
    System.out.print("Produziu: " + valor);
    this.valor = valor;
       
  }

  @Override
  public synchronized int get() throws InterruptedException {
    while(!ocupada){
      System.out.println("Ponte vazia. Consumidora aguardando");
      wait();
    }
    ocupada = false;
    notifyAll();
    System.err.print("Consumiu: " + valor);
    return valor;
  }
  
  
}
