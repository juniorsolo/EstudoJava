

package br.com.estudo.poo;

public class ArgumentosVariaveis {
  
  public static void main(String[] args){
    
    ArgumentosVariaveis a = new ArgumentosVariaveis();
    Double res = a.soma("soma ",new Double(12),new Double(33), new Double(45));
    System.out.println(res);
  }
  /*
    numero variável é o mesmo que lista porem a lista é obri
  gado passar um objeto do tipo list
  */
  Double soma(String titulo,Double ... numero){
    Double total= new Double(0);
    
    for(Double n: numero){
      total += n;
    }
    return total;
  }
  
}
