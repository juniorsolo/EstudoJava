package br.com.estudo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame{
   
   JComboBox<String> combo;
   JLabel label;
   ImageIcon[] imagens={
       new ImageIcon(getClass().getResource("imagen/coringa.jpg")),
       new ImageIcon(getClass().getResource("imagen/foto.jpg")),
       new ImageIcon(getClass().getResource("imagen/super.jpg")),
       new ImageIcon(getClass().getResource("imagen/yuyu.jpg")),
       new ImageIcon(getClass().getResource("imagen/yuyu12.jpg")),     
   };
   
   public ControleCombo(){
     super("Controle Combo");
     
     Container c = getContentPane();
     
     combo = new JComboBox<String>();
     combo.setFont(new Font("Serif", Font.PLAIN, 26));
     combo.addItem("coringa");
     combo.addItem("foto");
     combo.addItem("super");
     combo.addItem("yuyu");
     combo.addItem("yuyu12");
     combo.addItemListener(new ComboItemListener());
     label = new JLabel(imagens[0]);
     
     c.add(BorderLayout.NORTH, combo);
     c.add(BorderLayout.CENTER, label);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300, 530);
     setVisible(true);
   }
   
  class ComboItemListener implements ItemListener{
    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getStateChange() == ItemEvent.SELECTED){
         label.setIcon(imagens[combo.getSelectedIndex()]);
       }
    } 
  }
  public static void main(String[] args) {
     new ControleCombo();
  }
  
}
