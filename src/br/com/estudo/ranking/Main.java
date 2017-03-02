package br.com.estudo.ranking;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
    ArrayList<Ranking> l = Grava.getInstance().ler();
    Ranking r = new Ranking("ssss",1122L);
    l.add(r);
    Grava.getInstance().grava(l);
    ArrayList<Ranking> l1 = Grava.getInstance().ler();  
      for (Ranking x: l1) {
        System.out.println(x.getNome());
        System.out.println(x.getTempo());
      }   
  }
}
