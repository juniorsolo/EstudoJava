package br.com.estudo.logica;

public class ExemploSwitch {

  public static void main(String[] args) {
    char sexo = 'M';

    switch (sexo) {
      case 'F':
        System.out.println("Feminino");
        break;
      case 'M':
        System.out.println("Masculino");
        break;
    }
  }

}
