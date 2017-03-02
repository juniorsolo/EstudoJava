package br.com.estudo.desafio;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DesafioCalc1 extends JFrame {

  public DesafioCalc1() {
    super("Calculadora");
    Container c = getContentPane();
    Container p2 = new JPanel(new GridLayout(4, 4, 5, 5));
    p2.add(new JButton("7"));
    p2.add(new JButton("8"));
    p2.add(new JButton("9"));
    p2.add(new JButton("/"));
    p2.add(new JButton("4"));
    p2.add(new JButton("5"));
    p2.add(new JButton("6"));
    p2.add(new JButton("*"));
    p2.add(new JButton("1"));
    p2.add(new JButton("2"));
    p2.add(new JButton("3"));
    p2.add(new JButton("-"));
    p2.add(new JButton("0"));
    p2.add(new JButton("."));
    p2.add(new JButton("="));
    p2.add(new JButton("+"));

    JTextField display = new JTextField();
    display.setFont(new Font("serif",Font.PLAIN,26));
    c.add(BorderLayout.NORTH,display);
    c.add(BorderLayout.CENTER,p2);

    setSize(300, 300);
    setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new DesafioCalc1();
  }
}
