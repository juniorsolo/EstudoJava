
package br.com.estudo.recursividade;

public class ListaLigada {

    public static class Elemento{
        private Object valor;
        private Elemento proximo;
        
        public Elemento(Object valor){
           this.valor = valor; 
        }

        public Object getValor() {
            return valor;
        }

        public Elemento getProximo() {
            return proximo;
        }

        public void setProximo(Elemento proximo) {
            this.proximo = proximo;
        }
        
        public int contar(){
            if(this.proximo == null){
                return 1;
            }
            return 1 + proximo.contar();
        }
        
    }
    
    public static void main(String[] args) {
        ListaLigada.Elemento e = new Elemento("");
        ListaLigada.Elemento e2 = new Elemento("");
        ListaLigada.Elemento e3 = new Elemento("");
        ListaLigada.Elemento e4 = new Elemento("");
        
        e.setProximo(e2);
        e.getProximo().setProximo(e3);
        e.getProximo().getProximo().setProximo(e4);
        int n = e.contar();
        System.err.println(n);
    }
    
}
