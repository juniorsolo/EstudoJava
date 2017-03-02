
package br.com.estudo.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
  
  public Janela(){
    super("Minha janela");   
    JButton botao = new JButton("Click");
    getContentPane().add(botao);  
    setSize(300, 300);
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args) {
    new Janela();
  }
  
}
