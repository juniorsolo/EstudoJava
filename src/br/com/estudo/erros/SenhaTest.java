package br.com.estudo.erros;

public class SenhaTest {
  
  static void autenticar(String senha) throws SenhaInvalidaException{
     if("123".equals(senha)){
       System.out.println("Autenticado");
     }else{
       throw new SenhaInvalidaException(senha);
     }
  }
  public static void main(String[] args){
     try{
        autenticar("1234");
     }catch(SenhaInvalidaException ex){
       ex.printStackTrace();
       System.out.println(ex);
     }
         
  }
  
}
