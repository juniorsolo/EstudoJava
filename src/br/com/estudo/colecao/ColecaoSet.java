package br.com.estudo.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

  public static void main(String[] args) {
    String[] cores = {"verde", "amarelo", "azul", "branco", "azul", "amarelo", "verde"};

    List<String> list = Arrays.asList(cores);
    System.out.println("Lista:" + list);

    Set<String> set = new HashSet<>(list);
    System.out.println("Set com a lista: " + set);

  }

}
