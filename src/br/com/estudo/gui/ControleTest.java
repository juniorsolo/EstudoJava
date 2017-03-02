package br.com.estudo.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTest extends JFrame {

  JButton ok, cancel;
  JTextField tfLogin;
  JPasswordField jpPassword;

  public ControleTest() {
    super("Textos e senhas");
    ok = new JButton("Ok");
    ok.addActionListener(new BotaoOkListener());
    cancel = new JButton("Cancel");
    cancel.addActionListener(new BotaoCancelListener());
    tfLogin = new JTextField();
    jpPassword = new JPasswordField();
    Container c = getContentPane();
    c.setLayout(new GridLayout(3, 2, 5, 5));
    c.add(new Label("Login: "));
    c.add(tfLogin);
    c.add(new JLabel("Senha: "));
    c.add(jpPassword);
    c.add(ok);
    c.add(cancel);

    setLocationRelativeTo(null);
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new ControleTest();
  }

  class BotaoOkListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String s = " Login: " + tfLogin.getText()
          + " Senha: " + new String(jpPassword.getPassword());
      System.out.println("Clicou em ok ");
      JOptionPane.showMessageDialog(null, s);
    }
  }

  class BotaoCancelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      tfLogin.setText("");
      jpPassword.setText("");
      System.out.println("Clicou em Cancel");
    }

  }
}
