package br.com.estudo.threads;

public class ComprasEmFamilia implements Runnable {

  ContaConjunta conta = new ContaConjunta();

  @Override
  public void run() {
    String cliente = Thread.currentThread().getName();
    for (int i = 0; i < 5; i++) {
      conta.sacar(20, cliente);
      if (conta.getSaldo() < 0) {
        System.out.println("Estourou");
      }
    }
  }

  public static void main(String[] args) {
    ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
    new Thread(irAsCompras, "Pai").start();
    new Thread(irAsCompras, "Mae").start();
    new Thread(irAsCompras, "Filha").start();

  }

}
