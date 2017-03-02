package br.com.estudo.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author synergia
 */
@Documented  // usado quando vc quer que apareça a anotação na documentação  
@Target(ElementType.TYPE)
public @interface Cabecalho {
  //só usar tipos primitivos para anotação
  String instituicao();
  String projeto();
  String dataCriacao();
  String criador();
  int revisao();
}
