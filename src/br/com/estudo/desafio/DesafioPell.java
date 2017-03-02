
package br.com.estudo.desafio;

import java.util.Scanner;

public class DesafioPell {

  public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o numero para calcular a raiz: ");
    int num = entrada.nextInt();
    int cont=1;
    int raiz=0;
    int res = num;
    
    while(res > 0){
       if(cont % 2 == 0){
         res = res - cont;
         raiz ++;
       }            
       cont++;
    }
    System.out.println("Raiz:" + raiz);
  }
  
}
