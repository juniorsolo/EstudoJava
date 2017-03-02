
package br.com.estudo.threads;

public class MinhaRunnable implements Runnable{
   private String palavra;
   private Long tempo;
   
   public MinhaRunnable(String palavra, Long tempo){
     this.palavra = palavra;
     this.tempo = tempo;
   }
   
   public void run(){
     try{
       for(int i = 1; i < 10; i++){
         System.out.println(palavra);
         Thread.sleep(tempo);
       }
       return;
     }
     catch(InterruptedException e){
       
     }
   }
}
