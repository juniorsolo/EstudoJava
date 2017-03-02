package br.com.estudo.refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

  public static long carregarMemoria() {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 100_000; i++) {
      list.add(i);
    }
    return Runtime.getRuntime().freeMemory();
  }

  public static void main(String[] args) {

    Runtime rt = Runtime.getRuntime(); // pega o runtime
    int MB = 1_048_576; // Total de bytes em 1 MB
    double total = rt.maxMemory() / MB;
    double inicio = total - (carregarMemoria() / MB);
    System.out.println("Uso de memoria em MB: " + inicio);

    rt.runFinalization(); // finalizando todos obj carregados na memória
    rt.gc();
    double fim = total - (rt.freeMemory() / MB);
    System.out.println("Limpeza de memoria em MB: " + fim);
  }

}
