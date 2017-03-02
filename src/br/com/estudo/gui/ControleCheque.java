package br.com.estudo.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheque extends JFrame {
  JTextField texto;
  JCheckBox bold = new JCheckBox("Bold");
  JCheckBox italic = new JCheckBox("Italic");
  
  public ControleCheque() {
    super("Controle Cheque");
    texto = new JTextField("Veja a fonte Mudar", 12);
    texto.setFont(new Font("ArialNarrow", Font.PLAIN, 26));
    bold.addItemListener(new ChequeBoxListener());
    italic.addItemListener(new ChequeBoxListener());
    
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(texto);
    c.add(bold);
    c.add(italic);
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(300, 300);
  }
 class ChequeBoxListener implements ItemListener{

    @Override
    public void itemStateChanged(ItemEvent e) {
      if(bold.isSelected() && italic.isSelected()){
        texto.setFont(new Font("ArialNarrow", Font.BOLD | Font.ITALIC, 26));
      }else if(bold.isSelected()){
         texto.setFont(new Font("ArialNarrow", Font.BOLD, 26));
      }else if(italic.isSelected()){
         texto.setFont(new Font("ArialNarrow", Font.ITALIC, 26));
      }else{
        texto.setFont(new Font("ArialNarrow", Font.PLAIN, 26));
      }
          
    }
   
 }
  public static void main(String[] args) {
    new ControleCheque();
  }

}
