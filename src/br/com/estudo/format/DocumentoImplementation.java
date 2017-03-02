
package br.com.estudo.format;

public class DocumentoImplementation implements Documento{
  
  private String numero;

  public DocumentoImplementation() {
  }

  public DocumentoImplementation(String numero){
    this.numero= numero;
  }
  
  @Override
  public String getNumero() {
    return numero;
  }

  @Override
  public void setNumero(String numero) {
    this.numero = numero;
  }
  
}
