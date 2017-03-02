package br.com.estudo.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    String nome = "br.com.estudo.desafio.Contas";
    Class classe = Class.forName(nome); // retorna o tipo do objeto e não o objeto
    System.out.println(classe.getSimpleName());
    Field[] f = classe.getFields(); // retorna somente os campos publicos
    for (Field field : f) {
      System.out.println(field);
    }

    Method[] m = classe.getDeclaredMethods(); // retorna todos os métodos não importa o modificador
    for (Method method : m) {
      System.out.println(method.getName());
    }

    Constructor[] c = classe.getConstructors();// retorna os construtores
    for(Constructor co : c){
       System.out.println(co);
    }
    
    Object o = classe.newInstance();
    Method md = classe.getMethod("setSaldo", Float.class);
    md.invoke(o, 120F);
    md = classe.getMethod("getSaldo");
    System.out.println(md.invoke(o));
    
    Constructor co = classe.getConstructor(String.class, Float.class);
    Object obj= co.newInstance("JR" , 150_000.76F);
    
    System.out.println(md.invoke(obj));
    
  }

}
