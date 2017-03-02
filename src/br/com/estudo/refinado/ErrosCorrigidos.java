package br.com.estudo.refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD}) // elemento type  faz referencia a uma classe
public @interface ErrosCorrigidos {
    String[] value(); //value vc passa direto no construtor da anotação
    
}
