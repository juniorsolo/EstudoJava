package br.com.estudo.redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame {

  JTextField textoEnviar;
  JButton btEnviar;
  Socket socket;
  PrintWriter escritor;
  String nome;
  JTextArea textoRecebido;
  JScrollPane scroll;
  Scanner leitor;
  public ChatCliente(String nome) {
    super("Chat : " + nome);
    this.nome = nome;
    Font fonte = new Font("Serif", Font.PLAIN, 26);
    textoEnviar = new JTextField();
    textoEnviar.setFont(fonte);
    btEnviar = new JButton("Enviar");
    btEnviar.setFont(fonte);
    btEnviar.addActionListener(new EnviarListener());
    textoRecebido = new JTextArea();
    textoRecebido.setFont(fonte);
    scroll = new JScrollPane(textoRecebido);
    Container envio = new JPanel();
    envio.setLayout(new BorderLayout());
    envio.add(BorderLayout.CENTER, textoEnviar);
    envio.add(BorderLayout.EAST, btEnviar);
    getContentPane().add(BorderLayout.CENTER, scroll);
    getContentPane().add(BorderLayout.SOUTH, envio);
    configuraRede();

    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 400);
  }

  private class EnviarListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      escritor.println(nome + " : " + textoEnviar.getText());
      escritor.flush();
      textoEnviar.setText("");
      textoEnviar.requestFocus();
    }

  }

  private void configuraRede() {
    try {
      socket = new Socket("127.0.0.1", 5000); // inicializando socket de conexao com o servidor
      escritor = new PrintWriter(socket.getOutputStream()); // inicializando a escrita 
      leitor = new Scanner(socket.getInputStream()); // inicializando a escuta do servidor
      new Thread(new EscutaServidor()).start();
    } catch (Exception e) {
         e.printStackTrace();
    }

  }

  private class EscutaServidor implements Runnable{

    @Override
    public void run() {
      try{
      String texto;
      while((texto = leitor.nextLine()) != null){
        textoRecebido.append(texto + "\n");
      }
      }catch(Exception e){
        e.printStackTrace();
      }
    }
    
  } 
  public static void main(String[] args) {
    new ChatCliente(JOptionPane.showInputDialog("Digite seu nome: "));

  }
  
}
