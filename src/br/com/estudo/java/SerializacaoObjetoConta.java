
package br.com.estudo.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class SerializacaoObjetoConta {
  
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{ 
   String caminho = "C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/arquivoConta.sav";
   Path p = Paths.get(caminho);
   p.getParent();
   Cliente cli1 = new Cliente("Manoel", 26, "4541245548");
   Cliente cli2 = new Cliente("XPTO", 35, "9878645");
   Conta c1 = new Conta(cli1, 0000122L, new Double("4400.00"));
   Conta c2 = new Conta(cli2, 0000024L, new Double("2700.33"));
    ArrayList<Conta> lisGrav = new ArrayList<>();
    lisGrav.add(c1);
    lisGrav.add(c2);
   FileOutputStream fileout = new FileOutputStream(caminho);
   ObjectOutputStream objectGrava= new ObjectOutputStream(fileout);   
   objectGrava.writeObject(lisGrav);
   objectGrava.flush();
   objectGrava.close();
   
   FileInputStream fileIn = new FileInputStream(caminho);
   ObjectInputStream objectRecu = new ObjectInputStream(fileIn);
   ArrayList<Conta> lisRec = (ArrayList<Conta>)objectRecu.readObject();
   objectRecu.close();
   
   for(Conta c: lisRec){
     System.out.println(c.getCliente().getNome());
     System.out.println(c.getCliente().getRg());
     System.out.println(c.getCliente().getIdade());
     System.out.println(c.getNumero());
     System.out.println(c.getSaldo());    
   }
   
 }
}
