package br.com.estudo.java.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

  public static void main(String[] args) throws IOException{
    //java 7
    Path path = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/arquivo.txt");
    System.out.println(path.toAbsolutePath());
    System.out.println(path.getParent());
    System.out.println(path.getRoot());
    System.out.println(path.getFileName());
    
    /* Criando diretorio*/
    Files.createDirectories(path.getParent());
    
    /* Escrever e Ler Arquivos*/
    byte[] bytes = "Meu texto".getBytes();
    Files.write(path, bytes);
    
    byte[] retorno = Files.readAllBytes(path);
    System.out.println(new String(retorno));
    
  }
}
