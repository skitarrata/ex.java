package dispositivi;
import  java.lang.*;
import  java.util.*;
import  java.Date.*;

abstract class elettrodomestico implements centralina
{
  protected int stato = 1;
  private final int fermo = 1;
  private final int inFunzione = 2;
  private final int pausa = -1;
  public static int id = 0;
  public static int err = 0;
  private Date d = new Date();

  protected elettrodomestico(){}

  protected String tipo;
  protected String marca;
  protected long t_vita_max = TIMER;
  protected long t_tras_funzi;

  public elettrodomestico(String tipo, String marca)
  {
    err = parseString(tipo);
    if (err == 0)
      this.tipo = tipo;
    err = parseString(marca);
    if (err == 0)
      this.marca = marca;
    id++;
  }

  public void stop()
  {
    if (stato == fermo)
      return;
    else if (stato == inFunzione || stato == pausa)
      stato = fermo;
  }

  public void pause()
  {
    if (stato == pausa)
      return;
    else if (stato == inFunzione || stato == fermo)
      stato = pausa;
  }

  public void start(long n)
  {
    if (stato == fermo || stato == pausa)
      stato = inFunzione;
    if (stato == inFunzione)
    {
      for (long i = 0; i < TIMER; i++)
      {
        d.sleep(1000);
        t_tras_funzi++;
      }
    }
  }

  private final int parseString(String n)
{
  for(char ch: n.toCharArray())
    if((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z'))
    {
        System.out.println("tipo o modello non corretto\n");
        return 1;
    }
  return 0;
}

/*private final int parseNum(String num)
{
  for(char ch: num.toCharArray())
    if(ch < '0' || ch > '9')
    {
      System.out.println("Numero non definito\n");
      return 1;
    }
  return 0;
}*/

}
