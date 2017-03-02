package br.com.estudo.java;

import java.util.Calendar;

public class DataBeforeAfter {
  
  public static void main(String[] args) {
     Calendar c = Calendar.getInstance();
     c.set(2014,Calendar.SEPTEMBER,3);
     Calendar atual = Calendar.getInstance();
     
     System.out.println("Before anterior: " + c.before(atual));
     System.out.println("After depois: " + c.after(atual));
          
  }
  
}
