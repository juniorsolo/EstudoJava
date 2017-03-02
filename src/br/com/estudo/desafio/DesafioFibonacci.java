package br.com.estudo.desafio;

import java.util.Random;
import java.util.Scanner;

public class DesafioFibonacci {

  public static void main(String[] args) {
    Boolean continua = true;
    Integer n = 0;
    Integer prox = 1;
    System.out.println(n);

    while (prox < 2585) {
        System.out.println(prox);
        prox = n + prox;
        n = prox - n;
      }
  }
}
