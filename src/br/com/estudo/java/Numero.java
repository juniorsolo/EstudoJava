package br.com.estudo.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

  public static void main(String[] args) throws ParseException {
     double saldo = 123_456.789;
     NumberFormat f = NumberFormat.getInstance(); //genericos
     System.out.println("formatação padrao: " + f.format(saldo));
     
     f = NumberFormat.getIntegerInstance(); // inteiros
     System.out.println("Formatação de Integer: " +f.format(saldo));
     
     f = NumberFormat.getPercentInstance();//percentuais
     System.out.println("Formatação de porcentagem: " +f.format(0.25));
     
     f = NumberFormat.getCurrencyInstance(); // moedas
     System.out.println("Formatação de moeda: " +f.format(saldo));
     
     f.setMaximumFractionDigits(3);
     System.out.println("3 digitos fracionarios: " +f.format(saldo));
     
     /*Internacionalização*/
     
     f = NumberFormat.getCurrencyInstance(Locale.US); // USA
     System.out.println("Formatação de moeda Americana: " +f.format(saldo));
     
     f = NumberFormat.getCurrencyInstance(Locale.FRANCE); // frança
     System.out.println("Formatação de moeda francesa: " +f.format(saldo));
     
     /*Conversão de valores*/
     f = NumberFormat.getCurrencyInstance();
     System.out.println("parse de moeda para numero: "+f.parse("R$ 1.100,25"));
     
  }
  
}
