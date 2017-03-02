

package br.com.estudo.ranking;

import java.io.Serializable;

public class Ranking implements Serializable,Comparable<Ranking>{
  private String nome;
  private Long tempo;

  public Ranking(String nome, Long tempo) {
    this.nome = nome;
    this.tempo = tempo;
  }

  
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Long getTempo() {
    return tempo;
  }

  public void setTempo(Long tempo) {
    this.tempo = tempo;
  }

  @Override
  public int compareTo(Ranking o) {
    return this.tempo.compareTo(o.getTempo());
  }
  
  
}
