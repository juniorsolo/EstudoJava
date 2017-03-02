package br.com.estudo.java.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

  public static void main(String[] args) throws IOException {
    /* CREATE */
    Path path = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/fonte.txt");
    Files.deleteIfExists(path);
    Files.createFile(path);
    Files.write(path, "Meu texto".getBytes());
    
    /*COPIA*/
    Path copia = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/Copyfonte.txt");
    Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
    
    /*MOVER*/
    Path mover = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/bkp/Copyfonte.txt");
    Files.createDirectories(mover.getParent());
    Files.move(copia, mover,StandardCopyOption.REPLACE_EXISTING);
    
  }
}
