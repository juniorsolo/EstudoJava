

package br.com.estudo.strateg;


public class Conta {
  private Double x = 12.2;
  private Double y = 10.2;
  
  public Calculo calculo = new Soma();

  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }
  
  
}
