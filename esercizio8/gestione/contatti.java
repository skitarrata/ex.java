package gestione;
import  java.io.*;
import  java.lang.*;
import  java.util.*;

public class contatti
{
  protected String nome;
  private String cogn;
  private String numero;
  public static int  err = 0;

  private contatti(){}

  public contatti(String nome, String cogn, String numero)
  {
    this.nome = nome;
    if (err == 0)
      err = parseString(nome);
    this.cogn = cogn;
    if (err == 0)
      err = parseString(cogn);
    this.numero = numero;
    if (err == 0)
      err = parseNum(numero);
  }

  private final int parseString(String n)
  {
    for(char ch: n.toCharArray())
      if((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z'))
      {
          System.out.println("Nome o cognome errato\n");
          return 1;
      }
    return 0;
  }

  private final int parseNum(String num)
  {
    for(char ch: num.toCharArray())
      if(ch < '0' || ch > '9')
      {
        System.out.println("Numero non definito\n");
        return 1;
      }
    return 0;
  }

  public String toString()
  {
    String s = "Nome: " + nome;
    s += "\ncognome: " + cogn;
    s += "\nnumero: " + numero;
    return s;
  }

}
