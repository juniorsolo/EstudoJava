package br.com.estudo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBorderLayout extends JFrame{
   public GridBorderLayout(){
     super("Layouts2");
     
     Container c = getContentPane();
     c.setLayout(new BorderLayout());
     
     Container c2 = new JPanel();
     c2.setLayout(new GridLayout(4, 1));
     c2.add(new JButton("ok"));
     c2.add(new JButton("Cancel"));
     c2.add(new JButton("Setup"));
     c2.add(new JButton("Help"));
     c.add(BorderLayout.CENTER,new JButton("Center"));
     c.add(BorderLayout.EAST,c2);
    
     
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
     setSize(300, 300);
     setLocationRelativeTo(null);
   }

  public static void main(String[] args) {
      new GridBorderLayout();
  }
  
}
