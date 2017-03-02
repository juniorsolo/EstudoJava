package br.com.estudo.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
  List<PrintWriter> escritores = new ArrayList<>();
  
  public ChatServer() {
    ServerSocket server;
    try {
      server = new ServerSocket(5000);
      while (true) {
        Socket socket = server.accept();
        new Thread(new EscutaCliente(socket)).start();
        PrintWriter p = new PrintWriter(socket.getOutputStream());
        escritores.add(p);
        
      }
    } catch (IOException ex) {
       System.err.println("Servidor não pode inicializar o construtor, a porta já esta sendo usada.\n" + ex);
    }
  }
 
  private void encaminharTodos(String texto){
    try{
    for(PrintWriter w : escritores){
       w.println(texto);
       w.flush();
    }
    }catch(Exception e ){
       System.err.println("Servidor não pode encaminhar. " + e.getCause());  
    }
}
  
  private class EscutaCliente implements Runnable {

    Scanner leitor;

    public EscutaCliente(Socket socket) {
      try {
        leitor = new Scanner(socket.getInputStream());
      } catch (Exception ex) {
           System.err.println("Servidor não pode realizar a escuta. " + ex);
      }

    }

    @Override
    public void run() {
      try {
        String texto;
        while ((texto = leitor.nextLine()) != null) {         
          System.out.println(texto);
          encaminharTodos(texto);
        }
      } catch (Exception e) {
          System.err.println("Cliente fechou o chat. " + e);
      }
    }

  }

  public static void main(String[] args) {
    new ChatServer();

  }

}
