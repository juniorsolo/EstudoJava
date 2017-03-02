package br.com.estudo.criptografia;


public class TesteCrypto {


    public static void main(String[] args) {
        
        String t1 = "123";
        String t2 = "Admin";
        
        System.out.println(Crypto.getCriptografaMD5().execute(t1));
        //System.out.println(Crypto.getCriptografaMD5().execute(t2));
        
       // System.err.println(Crypto.getCriptografaMD5().execute(t1).
             //   equals(Crypto.getCriptografaMD5().execute(t2)));
        
    }
    
}
