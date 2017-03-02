package br.com.estudo.java;

public class StringOperacoes {
  public static void main(String[] args){
     String s1 = "Write once";
     String s2 = s1 + "run anywhere";
     String s3 = new String("Java Virtual Machine");
     char[] array = {'J','a','v','a'};
     String s4 = new String(array);
     
     //operações
     int tamano = s3.length();
     char letra= s3.charAt(0);
     
     //localização
     int posicao = s3.indexOf("Virtual");
     int ultimaPosicao = s3.lastIndexOf("a");
     
     //comparação
     String xti = "XTI";
     //System.out.println("xti".equalsIgnoreCase(xti)); // ignora maiusc e minuscula
     
     int c= "bola".compareTo("bola"); // retorna -1 qual vem primeiro na ordem alfabetica
     //System.out.println(c);
     
     String l = "Batatinha quando nasce";
     String sl= l.substring(10);
     //System.out.println(sl);
     
     sl = l.replace('a', '%');
     System.out.println(sl);
     
     sl = l.replaceFirst("a", "1");
     System.out.println(sl);
     
     System.out.println("    espa ço  de asdf asdf     ".trim());
     
     
  }
}
