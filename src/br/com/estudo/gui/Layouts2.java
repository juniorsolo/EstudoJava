package br.com.estudo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts2 extends JFrame{
   public Layouts2(){
     super("Layouts2");
     Container c = getContentPane();
     c.setLayout(new GridLayout(2,3));
     c.add(new JButton("1"));
     c.add(new JButton("2"));
     c.add(new JButton("3"));
     c.add(new JButton("4"));
     c.add(new JButton("5"));
     c.add(new JButton("6"));
     
     
     /*
     c.setLayout(new BorderLayout(15,5));// vertical horizontal
     c.add(BorderLayout.NORTH, new JButton("N"));
     c.add(BorderLayout.SOUTH, new JButton("S"));
     c.add(BorderLayout.EAST, new JButton("L"));
     c.add(BorderLayout.WEST, new JButton("O"));
     c.add(BorderLayout.CENTER, new JButton("C"));
     */
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     setSize(300, 300);
     setLocationRelativeTo(null);
   }

  public static void main(String[] args) {
      new Layouts2();
  }
  
}
