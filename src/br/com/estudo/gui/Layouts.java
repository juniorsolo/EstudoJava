package br.com.estudo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

  public Layouts() {
    super("Layouts");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(new JButton("1"));
    c.add(new JButton("2"));
    c.add(new JButton("3"));
    c.add(new JButton("4"));
    c.add(new JButton("5"));
    
    
    /*
    c.add(BorderLayout.NORTH, new JButton("Norte"));
    c.add(BorderLayout.SOUTH, new JButton("Sul"));
    c.add(BorderLayout.EAST, new JButton("Leste"));
    c.add(BorderLayout.WEST, new JButton("Oeste"));
    c.add(BorderLayout.CENTER, new JButton("Centro"));
    
    //getContentPane().add(new JButton("1"));
    //getContentPane().add(new JButton("2"));
    */
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(200,200);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Layouts();

  }

}
