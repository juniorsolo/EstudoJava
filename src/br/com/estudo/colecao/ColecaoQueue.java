package br.com.estudo.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

  public static void main(String[] args) {
       //fila de espera
       Queue<String> fila = new LinkedList<>(); 
       fila.add("Ricardo");
       fila.add("Sandra");  //adiciona elelemtno no final da fila
       fila.offer("Beatriz"); //adiciona elemento no final da fila
       
       System.out.println(fila);
       
       System.out.println("proximo: "+fila.peek());
       System.out.println("Remove o elemento do inicio: " + fila.poll());
       System.out.println(fila);
       
       /*Outros metodos disponível em linkedlist*/
       LinkedList<String> f = (LinkedList<String>) fila;
       f.addFirst("Caio"); // coloco no inicio da fila
       f.addLast("Juliana");// coloca no fim da fila
       System.out.println(fila);
       System.out.println("Primeiro da fila: " + f.peekFirst());
       System.out.println("Último da fila: "+f.peekLast());
       System.out.println("remove a primeira: "+f.pollFirst());
       System.out.println("Remove o ultimo: "+f.pollLast());
       System.out.println(f);
  }
  
}
