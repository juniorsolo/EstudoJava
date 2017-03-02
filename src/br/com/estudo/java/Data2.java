package br.com.estudo.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data2 {
  public static void main(String[] args){
    Calendar c = Calendar.getInstance();
    c.set(1980, Calendar.NOVEMBER, 12);
    Date date = c.getTime();
    
    System.out.println("Date sem formatação: " + date);
    
    /*Formatação de datas*/
    DateFormat f= DateFormat.getDateInstance();
    System.out.println("Formatação de Data: " + f.format(date));
    
    /*Formatação de horas*/
    f = DateFormat.getTimeInstance();
    System.out.println("Formatação de Hora: " + f.format(date));
        
    /*Formatação de Data e horas*/
    f = DateFormat.getDateTimeInstance();
    System.out.println("Formatação de Data e Hora: " + f.format(date));
    
    /*Estilos*/
    f = DateFormat.getDateInstance(DateFormat.FULL);
    System.out.println("Estilo Full: " + f.format(date));
    
    f = DateFormat.getDateInstance(DateFormat.LONG);
    System.out.println("Estilo Long: " + f.format(date));
    
    f = DateFormat.getDateInstance(DateFormat.MEDIUM);
    System.out.println("Estilo Medium: " + f.format(date));
    
    f = DateFormat.getDateInstance(DateFormat.SHORT);
    System.out.println("Estilo Short: " + f.format(date));
    
  }
}
