
package br.com.estudo.java.io;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Arquivo5 {
  public static void main(String[] args) throws IOException{
    Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
    
    /*  Lista diretorios */
    System.out.println("Imprimindo diretorios");
    for(Path path: dirs){
       System.out.println(path);
    }
    /*  Listar conteudo */
    Path dir = Paths.get("C:/Users/synergia/Documents/NetBeansProjects/Estudo");
    try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
       System.out.println("Imprimindo conteudo do diretorio");
        for(Path path: stream){
          System.out.println(path.getFileName());
        }  
      
    }catch(IOException | DirectoryIteratorException e){
       e.printStackTrace();
    }
    FileSystem fs = FileSystems.getDefault();
    System.out.println("Imprimindo Store");
    for(FileStore store : fs.getFileStores()){
      System.out.println("Unidade: " + store.toString());
      System.out.println("Total: " + store.getTotalSpace());
      System.out.println("Disponível: " + store.getUsableSpace()+ " Mb");
      System.out.println("Usado: " + store.getUsableSpace()+"Mb");
      System.out.println("Utilizado: " + ( (store.getTotalSpace() - store.getUsableSpace())) + "Mb");
    }
    
  }
}
