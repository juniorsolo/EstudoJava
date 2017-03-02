
package br.com.estudo.java;

public class TokensDelimitadores {
  public static void main(String[] args){
    String s = " XHTML; CSS; JavaScript; Java; JQuery";
    String[] tokens = s.split(";");
    
    System.out.println(tokens.length);

    for(String x : tokens){
      System.out.println(x);
    }
  }
  
}
