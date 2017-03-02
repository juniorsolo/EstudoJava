
package br.com.estudo.format;

public class TestFormatCPF {
 
  public static void main(String args[]){
 
    CPF cpf = new CPF("23515245789");
    System.out.println(CPFFormat.getInstance1().format(cpf,null,null));
    
    RG rg = new RG("224454458");
    System.out.println(RGFormat.getInstance1().format(rg, null, null));
    
    
  }
  
}
