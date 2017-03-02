package br.com.estudo.colecao;

import java.util.ArrayList;

public class Generico <E>{
  
  E elemento;
  public void setElemento(E elemento){
    this.elemento = elemento;
  }
  public E getElemento(){
    return elemento;
  }
  
  //Qualquer tipo que extenda number(int,double, float etc...)
  
  public double soma(ArrayList<? extends Number> lista){
     double total= 0;
     for(Number number : lista){
       total += number.doubleValue();
     }
     return total;
  }
  
  //Pai de number
  public double soma2(ArrayList<? super Number> lista){
     double total= 0;
     
     return total;
  }
 /*
  // antigamente generico era feito assim...
  Object elemento;
  public void setElemento(Object elemento){
    this.elemento = elemento;
  }
  public Object getElemento(){
    return elemento;
  }*/
  
  public static void main(String[] args) {
    /* 
    Generico g = new Generico();
     g.setElemento("Lago Paranoá");
     //g.setElemento(123321);
     String e = (String)g.getElemento();
     e.toUpperCase();*/
    Generico<String> g = new Generico<>();
    g.setElemento("Lago Paranoá");
    g.getElemento().toUpperCase();
  }
  
}
