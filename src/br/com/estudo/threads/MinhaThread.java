
package br.com.estudo.threads;

public class MinhaThread extends Thread{
   private String palavra;
   private Long tempo;
   
   public MinhaThread(String palavra, Long tempo){
     this.palavra = palavra;
     this.tempo = tempo;
   }
   
   public void run(){
     try{
       for(int i = 1; i > 0; i++){
         System.out.println(palavra);
         Thread.sleep(tempo);
       }
       return;
     }
     catch(InterruptedException e){
       
     }
   }
}
