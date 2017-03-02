package br.com.estudo.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean continua = true;
    int a = 0;
    int b = 0;
    try {
      do {
        System.out.print("Digite o valor de A: ");
        a= s.nextInt();
        
        System.out.print("Digite o valor de B: ");
        b= s.nextInt();
        
        
        System.out.println(a / b);
        continua = false;
      } while (continua);
    } catch (InputMismatchException | ArithmeticException ex) {
      System.err.println("Numero inválido");
     // s.nextLine();
    }
    finally{
      System.out.println("Terminado");
    }
  }
}
