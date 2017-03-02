package br.com.estudo.refinado;

import java.io.Serializable;

@Cabecalho(
    instituicao="Universidade XTI ",
    projeto="Sistema de Avaliações",
    dataCriacao = "12/09/2014",
    criador = "Manoel Rodrigues da S. junior",
    revisao = 2
)

@ErrosCorrigidos("001")
@SuppressWarnings({"serial","Não usada"})
public class Anotacao implements Serializable{
  
  @SuppressWarnings("Não usada")
  private int x;
  
  @Deprecated // indica para quem irá usar que esse metodo é depreciado
  public void anotar(){
  }
  
  @Override // informa que vc sobrescreveu um método
  public String toString(){
     return null;
  }
  
  
  
}
