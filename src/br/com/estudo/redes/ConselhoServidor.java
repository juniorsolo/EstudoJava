package br.com.estudo.redes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ConselhoServidor {

  public static void main(String[] args) throws IOException {

    ServerSocket server = new ServerSocket(5000);

    while (true) {
      Socket socket = server.accept(); // fica aguardando a chegada de novos clientes e retorna um socket
      try (PrintWriter w = new PrintWriter(socket.getOutputStream())) {
        w.print("Aprenda Java");
        
      } catch (Exception e) {

      }

    }

  }

}
