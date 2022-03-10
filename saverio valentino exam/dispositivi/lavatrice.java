package dispositivi;
import  java.util.*;
import  java.Date.*;

public final class lavatrice extends elettrodomestico
{
  private final int kgmax = 350;
  private int kgin;
  private long t;
  Date d = new Date();

  private lavatrice(){super();}
  public lavatrice(String t, String m){super(t, m);}

  public  void setCarico(int x){
    kgin = x;
    if (kgin > kgmax)
    {
      System.out.println("carico non supportato\n");
      kgin = 0;
    }
  }
  public  void signal(long n)
  {
    long i;
    for (i = 0; i <= n; i++)
      d.sleep(1000);
    if (i == n)
      stop();
  }

  public String toString()
  {
    String s = "la lavatrice " + tipo + "\n" + marca + "\n";
    s += "in stato di:";
    if (stato == 1)
      s += "fermo\n";
    else if(stato == 2)
      s += "in funzione\n";
    else if(stato == -1)
      s += "pausa\n";
    return s;
  }
}
