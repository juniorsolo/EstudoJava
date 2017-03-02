package br.com.estudo.ranking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grava {

  static private final String CAMINHO = "C:/Users/synergia/Documents/NetBeansProjects/Estudo/src/resouses/jogo/game.sav";
  static private final String CAMINHO2 = "C:/jogo/game.sav";

  public static Grava getInstance() {
    return new Grava();
  }

   public void grava(ArrayList<Ranking> lista) {
    validaCaminho();
    FileOutputStream fileOut;
    try {
      fileOut = new FileOutputStream(CAMINHO2);
      ObjectOutputStream grava = new ObjectOutputStream(fileOut);
      grava.writeObject(ordena(lista));
      grava.close();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Grava.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(Grava.class.getName()).log(Level.SEVERE, null, ex);
    }

  }
   private ArrayList<Ranking> ordena(ArrayList<Ranking> lista){
    Collections.sort(lista);
    return lista;
  }
   public ArrayList<Ranking> ler(){
    validaCaminho();
    FileInputStream fileIn;
    try{
      fileIn = new FileInputStream(CAMINHO2);
      ObjectInputStream ler = new ObjectInputStream(fileIn);
      ArrayList<Ranking> list = (ArrayList<Ranking>) ler.readObject();
      return list;
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Grava.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(Grava.class.getName()).log(Level.SEVERE, null, ex);     
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Grava.class.getName()).log(Level.SEVERE, null, ex);
    }
     return null;
  }

   private void validaCaminho() {
    Path path = Paths.get(CAMINHO2);
    if (Files.notExists(path)) {
      try {
        Files.createDirectories(path.getParent());
        Files.createFile(path);
        grava(new ArrayList<Ranking>());
      } catch (IOException ex) {
        Logger.getLogger(Grava.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
}
