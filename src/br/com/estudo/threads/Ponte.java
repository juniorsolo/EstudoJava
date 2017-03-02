package br.com.estudo.threads;

/**
 * Uma <code>Ponte</code> representa o elo
 * entre objetos Produtores e Consumidores
 * @author Junior
 * @version 1.3 da classe
 * @since 7.0 a versao de java que ela funciona
 * @see PonteNaoSincronizada
 * @see PonteSincronizada
 */
public interface Ponte {
  /**
   * Armazena o valor informado na ponte. Geralmente 
   * será chamado pelas classe produtoras.
   * @param valor
   * @throws InterruptedException 
   */
  public void set(int valor)throws InterruptedException;
  
  /**
   * Recupera a informação armazenada na ponte. Esse 
   * método será chamado pela classe Consumidoras.
   * @return
   * @throws InterruptedException 
   */
  public int get() throws InterruptedException;
  
}
