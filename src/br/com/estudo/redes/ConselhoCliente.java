package br.com.estudo.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {
  
  public static void main(String[] args) throws IOException {
    
    //0 - 1023 Não devem ser usadas, pois estão reservadas para serviços conhecidos.
    Socket socket = new Socket("127.0.0.1",5000 );      
    Scanner s = new Scanner(socket.getInputStream());
    System.out.println("Mensagem: " + s.nextLine());
    s.close();
  }
  
}
