
package br.com.estudo.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializacaoObjetoSimples {
  
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{ 
   String[] l = {"C#","HTML","Cobol","Java"};
   String caminho = "C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/arquivoObjeto.sav";
   FileOutputStream fileout = new FileOutputStream(caminho);
   ObjectOutputStream objectGrava= new ObjectOutputStream(fileout);   
   objectGrava.writeObject(l);
   objectGrava.flush();
   objectGrava.close();
   
   FileInputStream fileIn = new FileInputStream(caminho);
   ObjectInputStream objectRecu = new ObjectInputStream(fileIn);
   String[] ret = (String[])objectRecu.readObject();
   objectRecu.close();
   
   for(String x: ret){
     System.out.println(x);
   }
   
 }
}
