package br.com.estudo.format;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class RGFormat {

private static final Format1 format = new Format1();
  
public static Format1 getInstance1(){
   return format;
}
  
 public static class Format1 extends Format{

    @Override
    public StringBuffer format(Object obj, StringBuffer sb, FieldPosition pos) {
     if(obj instanceof RG){
       sb= new StringBuffer();
       RG rg = (RG)obj;
       if(rg.getNumero().length() == 9){
          StringBuffer sb2 = new StringBuffer(rg.getNumero());
          sb2.insert(2, '.');
          sb2.insert(6, '.');
          sb2.insert(10, '-');
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
