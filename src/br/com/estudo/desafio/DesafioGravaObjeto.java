package br.com.estudo.desafio;

import com.sun.corba.se.impl.io.IIOPInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DesafioGravaObjeto {

  public static void main(String[] args) throws IOException {
    Path caminho = Paths.get("D://projetos/Estudo/src/resouses/contas.txt");
    Charset utf8 = StandardCharsets.UTF_8;
    ArrayList<Contas> lista = new ArrayList<>();
    ArrayList<Contas> lista2 = new ArrayList<>();
    lista.add(new Contas("Junior", 10000.00F));
    lista.add(new Contas("Ligia", 8000.40F));
    lista.add(new Contas("Andressa", 9200.22F));
    lista.add(new Contas("Leandro", 7000.00F));
    lista.add(new Contas("Fabio", 14090.00F));

    try (BufferedWriter writer = Files.newBufferedWriter(caminho, utf8)) {
      for (Contas conta : lista) {
        writer.write(conta.getNome() + ";" + conta.getSaldo() + "\n");
      }
    }

    try (BufferedReader reader = Files.newBufferedReader(caminho, utf8)) {
      String linha = null;
      
      while ((linha = reader.readLine()) != null) {
        String[] t = linha.split(";");
        lista2.add(new Contas(t[0],Float.valueOf(t[1])));      
      }
    }
     for(Contas c : lista2){
       System.out.println(c.getNome() +" "+c.getSaldo());
     }
  }

}
