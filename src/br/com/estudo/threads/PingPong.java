package br.com.estudo.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PingPong extends Thread {

  String palavra;
  long tempo;

  public PingPong(String palavra, long tempo) {
    this.palavra = palavra;
    this.tempo = tempo;
  }

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
    new PingPong("ping", 1500).start();
    new PingPong("Pong", 1000).start();
    
  }

}
