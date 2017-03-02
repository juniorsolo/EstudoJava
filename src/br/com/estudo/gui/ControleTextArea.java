package br.com.estudo.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame {

  JTextArea texto;
  JScrollPane scroll;
  JButton botao;

  public ControleTextArea() {
    super("Controle text Area");

    texto = new JTextArea();
    texto.setFont(new Font("Serif", Font.PLAIN, 26));
    scroll = new JScrollPane(texto);
    botao = new JButton("Abrir Arquivo");
    botao.setFont(new Font("Sreif", Font.PLAIN, 26));
    botao.addActionListener(new TextAreaControle());

    Container c = getContentPane();
    c.add(BorderLayout.CENTER, scroll);
    c.add(BorderLayout.SOUTH, botao);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300, 300);
    setVisible(true);
  }

  class TextAreaControle implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      JFileChooser c = new JFileChooser();
      c.showOpenDialog(texto);
      File file=  c.getSelectedFile();
      try{
        Path path= Paths.get(file.getAbsolutePath());
        String retorno = new String(Files.readAllBytes(path));
        texto.setText(retorno);
      }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Não foi possivel carregar seu arquivo. Lamento...");
      }
    }

  }

  public static void main(String[] args) {
    new ControleTextArea();

  }

}
