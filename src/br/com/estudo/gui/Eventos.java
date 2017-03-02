package br.com.estudo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
     JButton b;
     public Eventos(){
       super("Eventos");
       
       b = new JButton("Clique Aqui");
       b.addActionListener(this);
       getContentPane().add(b);
      
       setSize(300, 300);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     
  @Override
  public void actionPerformed(ActionEvent e) {
    b.setText("Foi clicado");
    System.out.println("Clicou");
  }
  
  public static void main(String[] args) {
     new Eventos();
  }
}
