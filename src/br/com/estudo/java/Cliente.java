

package br.com.estudo.java;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable{
  private String nome;
  private Integer idade;
  private String  rg;

  public Cliente(String nome, Integer idade, String rg) {
    this.nome = nome;
    this.idade = idade;
    this.rg = rg;
  }

  public Cliente() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 59 * hash + Objects.hashCode(this.rg);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Cliente other = (Cliente) obj;
    if (!Objects.equals(this.rg, other.rg)) {
      return false;
    }
    return true;
  }
  
  
  
}
