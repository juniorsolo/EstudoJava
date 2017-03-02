
package br.com.estudo.java;

import java.io.Serializable;
import java.util.Objects;

public class Conta implements Serializable{
    private Cliente cliente;
    private Long numero;
    private Double saldo;

  public Conta() {
  }

  public Conta(Cliente cliente, Long numero, Double saldo) {
    this.cliente = cliente;
    this.numero = numero;
    this.saldo = saldo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Long getNumero() {
    return numero;
  }

  public void setNumero(Long numero) {
    this.numero = numero;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 41 * hash + Objects.hashCode(this.numero);
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
    final Conta other = (Conta) obj;
    if (!Objects.equals(this.numero, other.numero)) {
      return false;
    }
    return true;
  }
  
  
    
}
