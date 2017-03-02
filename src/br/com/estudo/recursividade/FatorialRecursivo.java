package br.com.estudo.recursividade;

public class FatorialRecursivo {

    public static int fatorial (int n){
        
        if(n == 1){
           return 1; 
        }
        System.out.println(n + " * " +(n-1));
        return n * fatorial(n -1);
    }
    
    public static void main(String[] args) {

       int n = FatorialRecursivo.fatorial(3);
       
        System.err.println(n);
    }
    
}
