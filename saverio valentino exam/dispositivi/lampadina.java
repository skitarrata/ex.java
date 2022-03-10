package dispositivi;
import  java.lang.*;
import  java.util.*;

public final class lampadina extends elettrodomestico
{
  private final int fun = 1000;
  private lampadina(){}
  public lampadina(String t, String m){super(t, m);}

  public void signal(long n)
  {
    t_vita_max = n;
    if (t_vita_max >= fun)
    {
      System.out.println("l'elettrodomestico si è rotto\n");
      stop();
      return;
    }
  }

  public String toString()
  {
    String s = "la lampadina " + tipo + "\n" + marca + "\n";
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
