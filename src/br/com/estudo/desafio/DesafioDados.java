package br.com.estudo.desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioDados {
  
  public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite o palpite: ");
     int palpite = entrada.nextInt();
     Random r = new Random();
     int dado = r.nextInt(6) + 1;
     System.out.println("Valor do dado: " + dado);
     
     if(dado == palpite){
           System.out.println("Acertou!!!");
     }else{
          System.out.println("Errou!");
     }
  }
}
