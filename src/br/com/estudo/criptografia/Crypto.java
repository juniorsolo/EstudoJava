package br.com.estudo.criptografia;

import java.security.MessageDigest;

public class Crypto {

  private static String MD5 = "MD5";
  private static String SHA_256 = "SHA-256";
  private static String SHA_512 = "SHA-512";

  private static final Algoritimo criptografaMD5 = new Algoritimo(MD5);
  private static final Algoritimo criptografaSHA_256 = new Algoritimo(SHA_256);
  private static final Algoritimo criptografaSHA_512 = new Algoritimo(SHA_512);

  public static final Algoritimo getCriptografaMD5() {
    return criptografaMD5;
  }

  public static final Algoritimo getCriptografaSHA_256() {
    return criptografaSHA_256;
  }

  public static final Algoritimo getCriptografaSHA512() {
    return criptografaSHA_512;
  }

  public static class Algoritimo {

    private StringBuilder hexTextoCifrado;
    private String tipo;

    public Algoritimo(String tipo) {
      this.tipo = tipo;
    }

    public String execute(String texto) {
      try {
        texto = texto == null ? "" : texto;
        //recebe o tipo 
        MessageDigest algorithm = MessageDigest.getInstance(tipo);
        byte textoCifrado[] = algorithm.digest(texto.getBytes("UTF-8"));

        hexTextoCifrado = new StringBuilder();
        //muda p texto para hexadecimal e o 0xFF retira numeros negativos
        for (byte b : textoCifrado) {
          hexTextoCifrado.append(String.format("%02x", 0xFF & b));
        }
        return hexTextoCifrado.toString();
      } catch (Exception e) {
        e.printStackTrace();
        return "";
      }
    }

  }

}
