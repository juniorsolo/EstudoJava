
package br.com.estudo.desafio;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DesafioCalc extends JFrame{
     
   public DesafioCalc(){
     super("Calculadora");
     Container c = getContentPane();
     c.setLayout(new GridLayout(5, 1,3,2));
     JPanel p0 = new JPanel(new GridLayout(1, 1));
     p0.add(new JTextField(""));
     
     JPanel p1 = new JPanel(new GridLayout(1, 4,3,5));
     p1.add(new JButton("7"));
     p1.add(new JButton("8"));
     p1.add(new JButton("9"));
     p1.add(new JButton("/"));
     
     JPanel p2 = new JPanel(new GridLayout(1, 4,3,5));
     p2.add(new JButton("4"));
     p2.add(new JButton("5"));
     p2.add(new JButton("6"));
     p2.add(new JButton("*"));
     
     JPanel p3 = new JPanel(new GridLayout(1, 4,3,5));
     p3.add(new JButton("1"));
     p3.add(new JButton("2"));
     p3.add(new JButton("3"));
     p3.add(new JButton("-"));
     
     JPanel p4 = new JPanel(new GridLayout(1, 4,3,5));
     p4.add(new JButton("0"));
     p4.add(new JButton("."));
     p4.add(new JButton("="));
     p4.add(new JButton("+"));
     
     c.add(p0);
     c.add(p1);
     c.add(p2);
     c.add(p3);
     c.add(p4);
     
     
     
     setSize(300,300);
     setLocationRelativeTo(null);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  
  public static void main(String[] args) {
    new DesafioCalc();
  } 
}
