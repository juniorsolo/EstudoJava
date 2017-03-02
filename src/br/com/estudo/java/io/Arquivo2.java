package br.com.estudo.java.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/arquivo.txt");
    Charset utf8 = StandardCharsets.UTF_8;
    
    /*apartir do java 7 um objeto que implementa a interface Closable 
      são automaticamente fechados   
    */    
    try( BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
      w.write("Texto teste2\n");
      w.write("Texto 123344\n");
      //w.flush(); // nao precisa chmar po ter poucos dados

    } catch (IOException e) {
      e.printStackTrace();
    } 

  }
}
