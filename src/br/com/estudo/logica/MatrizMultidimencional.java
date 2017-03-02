package br.com.estudo.logica;

import java.util.Random;



public class MatrizMultidimencional {
  
public static void main(String[] args){
  
  String[][] duas ={{"joao","M","30"},{"breno","M","22"},{"auga","F","18"},
     {"xxx","F","20"}};
  System.out.println("Elementos dentro do array: " + duas.length);
  System.out.println("Elementos da posicao 0: " + duas[0].length);
  
  String[] faces= {"A","1","2","3","4","5","6","7","8","9","10","Dama","Valete","Rei"};
  String[] nipes={"Espada","Paus","Copas","Ouro"};
  
  Random r = new Random();
  
  int indiceFace= r.nextInt(faces.length);
  String face = faces[indiceFace];
  
  int indiceNipe= r.nextInt(nipes.length);
  String nipe = nipes[indiceNipe];
  
  String carta= face + " " + nipe;
  
  System.out.println(carta);
}  
  
}
