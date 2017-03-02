package br.com.estudo.erros;

public class SenhaInvalidaException extends Exception {

  public SenhaInvalidaException(String senha) {
    super("A senha: " + senha + " esta incorreta.");
  }
}
