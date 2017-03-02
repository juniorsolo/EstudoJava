
package br.com.estudo.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame{
   
    public ControleLabel(){
      super("Controle Label");
      
      JLabel simples = new JLabel("Label Simples");
      simples.setToolTipText("Meu toltip");
      
      
      Font fonte = new Font("serif",Font.ITALIC | Font.BOLD,12);
      simples.setFont(fonte);
      simples.setForeground(Color.BLUE);
      
      ImageIcon icon = new ImageIcon(getClass().getResource("imagen/foto.jpg"));
      JLabel label = new JLabel(icon);
    
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      c.add(simples);
      c.add(label);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setSize(300, 300);
      setVisible(true);
    }

  public static void main(String[] args) {
    new ControleLabel();
  }
  
}
