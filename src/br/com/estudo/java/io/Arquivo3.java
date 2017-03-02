package br.com.estudo.java.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo3 {

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/arquivo.txt");
    
    System.out.println("Existe? " + Files.exists(path));
    System.out.println("E diretorio? " + Files.isDirectory(path));
    System.out.println("Regular file? " + Files.isRegularFile(path));
    System.out.println("Usuario permissao? " + Files.isReadable(path));
    System.out.println("Executavel? " + Files.isExecutable(path));
    System.out.println("Tamanho? " + Files.size(path));
    System.out.println("ultima Modificacao? " + Files.getLastModifiedTime(path));
    System.out.println("Dono? " + Files.getOwner(path));
    System.out.println("Tipo arquivo: " + Files.probeContentType(path));
    
    //DELETE
    //Files.delete(path);
    //Files.deleteIfExists(path);
    
    
  }
}
