package br.com.estudo.java;


import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

  public static void main(String[] args) throws IOException {
    Properties p = System.getProperties();// retorna properties que é uma coleção do tipo map
    //System.out.println(p.getProperty("java.version"));
    //p.setProperty("xti.curso.java.version", "1.0.0");
    
    Set<Object> pk = p.keySet();   
    for(Object key: pk){
       System.out.println(key + " = " + p.get(key));
    }
    /*
    Console c = System.console();
    
    System.out.print("Usuario: ");
    String user = (String)c.readLine();
    
    System.out.print("Senha: ");
    char[] pass = c.readPassword();
    System.out.println("usario:" + user + " senha: " + new String(pass));
    */
    /*
    so da para executar ple linha de comando usando o comando abaixo, e com o jar
    da aplicação apontado no classpath
    
    C:\Users\synergia\Documents\NetBeansProjects\Estudo>java -classpath C:\XTI.jar b
      r.com.estudo.java.Sistemas
    
    Runtime.getRuntime().exec("notepad");
 */  }
 
}
