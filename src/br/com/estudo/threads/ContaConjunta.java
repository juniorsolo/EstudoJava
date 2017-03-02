package br.com.estudo.threads;

public class ContaConjunta {

  private int saldo = 100;

  public int getSaldo() {
    return saldo;
  }

  public synchronized void sacar(int valor, String cliente){
    int saldoOriginal = saldo;
    if (saldo >= valor) {
      System.out.println(cliente + " vai sacar");
      try{
      System.out.println(cliente + " esperando"); 
      Thread.sleep(1000L);
      saldo -= valor;
      System.out.println(cliente + " sacou " + valor + " Original: " + saldoOriginal + " Saldo final: " +(saldoOriginal - valor));
      }catch(InterruptedException e){
          e.printStackTrace();
      }
    } else {
      System.out.println("Saldo insuficiente para: " + cliente);
    }
  }

}
