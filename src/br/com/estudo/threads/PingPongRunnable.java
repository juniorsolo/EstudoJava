package br.com.estudo.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PingPongRunnable implements Runnable{

  String palavra;
  long tempo;

  public PingPongRunnable(String palavra, long tempo) {
    this.palavra = palavra;
    this.tempo = tempo;
  }
  @Override
  public void run() {
    try {
      for (int i = 0; i < 5; i++) {
        System.out.print(palavra + " ");
        Thread.sleep(tempo);
      }
    } catch (InterruptedException ex) {
    }

  }

  public static void main(String[] args) {
    
    Runnable ping = new PingPong("Ping", 1500L);
    Runnable pong = new PingPong("PONG", 1500L);
    
    new Thread(ping,"ping").start();
    new Thread(pong,"PONG").start();
    
    
  }

}
