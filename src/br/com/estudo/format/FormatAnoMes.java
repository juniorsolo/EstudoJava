package br.com.estudo.format;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class FormatAnoMes {

  private static final Format DISPLAY_FORMAT = new MesAnoDisplayFormat();
  
  public static final Format getDisplayFormat() {
    return DISPLAY_FORMAT;
  }
  
  private static class MesAnoDisplayFormat extends Format {

    @Override
    public StringBuffer format(Object obj, StringBuffer sb, FieldPosition pos) {
      
      if(obj instanceof Long && sb != null){
        Long anoMes = (Long) obj;
         sb = new StringBuffer();
         sb.append(((int)(anoMes/12)));
         sb.append("/");
         sb.append(((int)(anoMes%12)));
      }
      return sb;
    }

    @Override
    public Object parseObject(String source, ParsePosition pos) {
      if (source != null && source.length() > 0) {
        return Long.parseLong(source);
      }
      return null;
    }
  }
}
