
package br.com.estudo.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    public static void main(String[] args){
        /* 01 de jan 1970*/
        System.out.println("Milisegundos atual: "+System.currentTimeMillis()); 
        Date agora = new Date();
        System.out.println("date sem formata��o: " + agora);
        
        Date data = new Date(1_000_000_000_000L);
        System.out.println("Setando a data em milisegundos" +data);
        
        /*Metodos*/
        data.getTime();
        data.setTime(8_000_000_000_000L);
        System.out.println("data comparada com agora: " + data);        
        System.out.println(data.compareTo(agora));//retorna -1 se for menor, 0 igual, 1 maior
        
        /* GregorianCalendar*/
        Calendar c = Calendar.getInstance(); // classe abstrata nao pode ser instanciada
        //new GregorianCalendar(); outra maneira de instanciar o gregorianCalendar
        c.set(1980, Calendar.JANUARY, 12);
        System.out.println("calendar sem formata��o: "+c);
        System.out.println("calendar retornado Date: "+c.getTime());
        System.out.println("calendar retonando ano " +c.get(Calendar.YEAR));
        System.out.println("calendar retonando mes " +c.get(Calendar.MONTH));//0-11
        System.out.println("calendar retonando dia mes " +c.get(Calendar.DAY_OF_MONTH));
        System.out.println("calendar retonando dia da semana " +c.get(Calendar.DAY_OF_WEEK));
        
        c.set(Calendar.YEAR,1972); // altera ano
        c.set(Calendar.MONTH,10); // altera mes
        c.set(Calendar.DAY_OF_MONTH,20); // altera o dia do mes
        System.out.println("data modificada: " + c.getTime());
        
        
        c.clear(Calendar.SECOND);// limpando segundos
        c.clear(Calendar.MINUTE);// limpando minutos
        System.out.println("limpano minuto e segundo:"+c.getTime());
        
        c.add(Calendar.YEAR, 2); // adicionando ano
        c.add(Calendar.DAY_OF_MONTH, 12); // adicionando dia no mes ele pula o mes caso ultrapasse
        System.out.println("adicionando 2 ano e 12 dias no mes: " + c.getTime());
        
        c.add(Calendar.YEAR, -1); // adicionando ano
        System.out.println("diminuindo 1 ano: " + c.getTime());
        
        c.roll(Calendar.DAY_OF_MONTH, 30);
        System.out.println("usando roll, adicionando 30 dias: " + c.getTime());
        
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR);
        
        if(hora < 12){
            System.out.println("Bom dia!");  
        }else if(hora > 12 && hora < 18){
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }
    }
}
