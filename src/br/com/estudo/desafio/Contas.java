
package br.com.estudo.desafio;

import java.io.Serializable;

public class Contas implements Serializable{
  private String nome;
  private Float saldo;
  public  String cliente;
  public int numeroConta;

  public Contas(){}
  public Contas(String nome, Float saldo){
  this.nome= nome;
  this.saldo=saldo;
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Float getSaldo() {
    return saldo;
  }
  public void setSaldo(Float saldo) {
    this.saldo = saldo;
  }
  
  
}
