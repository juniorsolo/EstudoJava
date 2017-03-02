package br.com.estudo.java.regular.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

  public static void main(String[] args) {
    String padrao = "Java";
    String texto = "java";
    boolean b = texto.matches(padrao);
    System.out.println("(matches padrao) Java = java: " + b);

    /* MODIFICADORES
     (?i), Ignora maiúscula e minúscula
     (?x), Comentários 
     (?m), Multilinhas
     (?s), Dottal 
     */
    b = "Java".matches("(?i)java");
    System.out.println("(?i) Java = java: " + b);

    /* METACARACTERES
     .   qualquer caracter
     \d  dígitos      [0-9]        
     \D  não é dígito [^0-9]
     \s  espaços      [\t\n\x0B\f\r] 
     \S  não é espaço [^\s]
     \w  letra        [a-zA-Z_0-9]
     \W  não é letra 
     */
    b = "@".matches(".");
    System.out.println(". existe caracter? " + b);

    b = "2".matches("\\d");
    System.out.println("\\d existe digito? " + b);

    b = "22".matches("\\d\\d");
    System.out.println("\\d \\d existe 2 digitos? " + b);

    b = "70294-070".matches("\\d\\d\\d\\d\\d-\\d\\d\\d");
    System.out.println("cep 70294-070 correto? " + b);

    /* QUANTIFICADORES
     X{n}     X, exatamente n vezes
     X{n,}    X, pelo menos n vezes
     X{n, m}  X, pelo menos n mas não mais do que m vezes
     X?       X, 0 ou 1 vez
     X*       X, 0 ou + vezes
     X+       X, 1 ou + vezes 
     */
    b = "21".matches("\\d{2}");
    System.out.println("\\d{2} tem 2 digitos? " + b);

    b = "1".matches("\\d{2,}");
    System.out.println("\\d{2,} tem pelo menos 2 digitos? " + b);

    b = "123456".matches("\\d{2,5}");
    System.out.println("\\d{2,5} tem pelo menos 2 digitos e não mais que 5 digitos ? " + b);

    b = "".matches(".?");
    System.out.println("tem 0 ou 1 caracter? " + b);

    b = "abcde1245".matches(".*");
    System.out.println("tem 0 ou mais caracteres? " + b);

    b = "".matches(".+");
    System.out.println("tem 1 ou mais caracteres? " + b);

    b = "70294-070".matches("\\d{5}-\\d{3}");
    System.out.println("cep 70294-070 correto? " + b);

    b = "18/12/2014".matches("\\d{2}/\\d{2}/\\d{4}");
    System.out.println("a data 18/12/2014 esta correta? " + b);

    /* METACARACTERES DE FRONTEIRA
     ^ inicia
     $ finaliza
     | ou
     */
    b = "Pier21".matches("^Pier.*");
    System.out.println("Começa com Pier e continua com qualquer caracter? " + b);

    b = "Pier21".matches(".*21$");
    System.out.println("Termina com 21? " + b);

    b = "tem java no texto".matches(".*java.*");
    System.out.println("Existe java no texto? " + b);

    b = "tem java no texto".matches("^tem.*texto$");
    System.out.println("começa com (tem) o meio não importa e termina com (texto)? " + b);

    b = "sim".matches("sim|não");
    System.out.println("é sim ou não? " + b);

    /* AGRUPADORES
     [...]           Agrupamento
     [a-z]           Alcance
     [a-e][i-u]      União
     [a-z&&[aeiou]]  Interseção
     [^abc]          Exceção
     [a-z&&[^m-p]]   Subtração
     \x              Fuga literal
     */
    
    b = "2".matches("[a-z]");
    System.out.println("[a-z]? " + b);
    
    b = "6".matches("[0-5]");
    System.out.println("[0-5]? " + b);
    
    b = "true".matches("[tT]rue");
    System.out.println("começa com maiuscula ou minuscula [tT]rue? " + b); //true ou True
    
    b = "Yes".matches("[tT]rue|[yY]es");
    System.out.println("[tT]rue|[yY]es ? " + b); //true ou True ou yes ou Yes 
   
    b = "Manoel".matches("[A-Z][a-zA-Z]*");
    System.out.println("Manoel começa com letra maiuscula? " + b); //Primeiro nome começa com letra maiúscula 
    
    b = "olho".matches("[^abc]lho");
    System.out.println("(olho) não começa com (abc) e termina com (lho)? " + b);  
    
    b = "crau".matches("cr[ae]u");
    System.out.println("(crau) é crau ou creu? " + b); 
    
    b = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w{3}\\.\\w{2}");
    System.out.println("O email (rh@xti.com.br) é valido? " + b); //validação de email exemplo simples
    
    String doce = "Qual é o Doce mais doCe que o doce?";
    Matcher matcher =  Pattern.compile("(?i)doce").matcher(doce);
    while(matcher.find()){
      System.out.println("(?i)doce expressão encontrada: " +matcher.group());
    }
    
    /* SUBSTITUIÇÃO*/
    String r = doce.replaceAll("(?i)doce", "DOCINHO");
    System.out.println("substiruição:  " + r);  
    
    String rato = "O rato roeu a roupa do rei de roma";
    r = rato.replaceAll("r[aeiou]", "XX");
    System.out.println(r);
    
    r = "Tabular este texto".replaceAll("\\s", "\t"); // procurar espaço e substituir por tabulação
    System.out.println(r);
    
    String url="www.xti.com.br/clientes-2014.html";
               //http://www.xti.com.br/2014/clientes.jsp // objetivo 
    
    String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
    b = url.matches(re);
    System.out.println("Espressão funcionou? " + b);
    
    re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
    
    r = url.replaceAll(re,"http://$1/$3/$2.jsp");
    System.out.println("antes: " + url);
    System.out.println("depois: " +r);
    
  }  

}
