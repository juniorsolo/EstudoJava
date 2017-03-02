
package br.com.estudo.threads;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class TesteThread {
  public static void main(String[] args) throws InterruptedException{
    //new MinhaThread("Pìng ",500L).start();
    //new MinhaThread("Pong",500L).start();
    Runnable ping= new MinhaRunnable("ping", 1000L);
    Runnable pong= new MinhaRunnable("pong", 1000L);
    
    new Thread(pong).start();
    new Thread(ping).start();
    
  }
}
