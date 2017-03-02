package br.com.estudo.format;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class CPFFormat {

  private static CPFFormt1 FORMAT = new CPFFormt1();
  private static CPFFormt2 FORMAT2 = new CPFFormt2();

  public static CPFFormt1 getInstance1() {
    return FORMAT;
  }
  public static CPFFormt2 getInstance2() {
    return FORMAT2;
  }

  public static class CPFFormt1 extends Format {

    public StringBuffer format(Object obj, StringBuffer sb, FieldPosition pos) {
      if (obj instanceof CPF) {
        CPF cpf = (CPF) obj;
        sb = new StringBuffer();
        if (cpf.getNumero().length() == 11) {       
          StringBuffer sb2 = new StringBuffer(cpf.getNumero());
          sb2.insert(3, '.');
          sb2.insert(7, '.');
          sb2.insert(11, '-');
          sb.append(sb2);
        }
      }
      return sb;
    }

    @Override
    public Object parseObject(String source, ParsePosition pos) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }
  
  private static class CPFFormt2 extends Format {

    public StringBuffer format(Object obj, StringBuffer sb, FieldPosition pos) {
      if (obj instanceof CPF) {
        CPF cpf = (CPF) obj;

        if (cpf != null) {
          sb = new StringBuffer();
          StringBuffer sb2 = new StringBuffer(cpf.getNumero());
          sb2.insert(3, '.');
          sb2.insert(7, '.');
          sb2.insert(11, '-');
          sb.append(sb2);
        }
      }
      return sb;
    }

    @Override
    public Object parseObject(String source, ParsePosition pos) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  }

 

}
