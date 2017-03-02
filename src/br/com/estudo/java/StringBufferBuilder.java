package br.com.estudo.java;

public class StringBufferBuilder {
  public static void main(String[] args){
    StringBuffer  s0 = new StringBuffer();
    StringBuilder s1 = new StringBuilder("java");
    
    s1.toString();
    System.out.println(s1.length());
    System.out.println(s1.capacity()); // capacidade sem precisar alocar memória
    //System.out.println(s1.reverse()); // reverte os caracteres
    
    char[] c ={' ','c','o','m'}; 
    s1.append(c).append(" textos");  
    System.out.println(s1);
    
    String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString(); //remove 4 caracteres
    System.out.println(url);
    
  }
  
}
