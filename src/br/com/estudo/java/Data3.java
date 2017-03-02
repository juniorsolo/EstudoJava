package br.com.estudo.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data3 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1970,Calendar.FEBRUARY, 12);
        Date date = c.getTime();
        
        Locale padrao = Locale.getDefault();
        Locale brasil = new Locale("pt","BR");
        Locale india = new Locale("hi", "IN");
        Locale usa = new Locale("en", "USA");
        Locale japao = Locale.JAPANESE;
        Locale italiano = Locale.ITALIAN;
        
        
        DateFormat f = DateFormat.getDateInstance(DateFormat.FULL,brasil);
        System.out.println(f.format(date));
        
        f = DateFormat.getDateInstance(DateFormat.FULL,india);
        System.out.println(f.format(date));
        
        f = DateFormat.getDateInstance(DateFormat.FULL,usa);
        System.out.println(f.format(date));
        
        f = DateFormat.getDateInstance(DateFormat.FULL,japao);
        System.out.println(f.format(date));
        
        f = DateFormat.getDateInstance(DateFormat.FULL,italiano);
        System.out.println(f.format(date));
        
    }
}
