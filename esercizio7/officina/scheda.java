package officina;

public class scheda
{
  private static final int IN_RIP = 0;
  private static final int RIPARATO = 1;
  private static final int CONSEGNATO = 2;
  private static final int NO_PRES = 3;
  public static int n_sched = 0;
  public static int stato;
  private int n_autoff = 0;
  public static int n_autotratt = 0;
  private String datarr = new String();
  private String datari = new String();
  auto automobile = null;

  scheda(){++n_sched;}
  scheda(auto a)
  {
    this();
    if (a != null)
    {
      a.copyTo(automobile);
      ++n_autoff;
      stato = IN_RIP;
    }
  }
  scheda(auto a, String data)
  {
    this(a);
    datarr = new String(data);
  }
  scheda(scheda s)
  {
    this(s.automobile);
    this.datarr = new String(s.datarr);
    this.datari = new String(s.datari);
    this.n_autoff++;
  }
  public void ingressoff(String data)
  {
    datarr = new String(data);
    stato = IN_RIP;
  }
  public void setState(int s)
  {
    switch(s)
    {
      case IN_RIP:
            switch(stato)
            {
              case IN_RIP:
                    System.out.println("già in riparazione\n");
                    break;
              case RIPARATO:
                    stato = RIPARATO;
                    break;
              case CONSEGNATO:
                    stato = CONSEGNATO;
                    break;
              case NO_PRES:
                    stato = NO_PRES;
                    System.out.println("non esiste\n");
                    break;
            }
            break;
      case RIPARATO:
            switch(stato)
            {
              case IN_RIP:
                    stato = IN_RIP;
                    break;
              case RIPARATO:
                    System.out.println("gia riparata\n");
                    break;
              case CONSEGNATO:
                    stato = CONSEGNATO;
                    break;
              case NO_PRES:
                    stato = NO_PRES;
                    System.out.println("non esiste\n");
                    break;
            }
            break;
      case CONSEGNATO:
            switch(stato)
            {
              case IN_RIP:
                    stato = IN_RIP;
                    break;
              case RIPARATO:
                    stato = RIPARATO;
                    break;
              case CONSEGNATO:
                    System.out.println("consegnata\n");
                    break;
              case NO_PRES:
                    stato = NO_PRES;
                    System.out.println("non esiste\n");
                    break;
            }
            break;
      case NO_PRES:
            stato = NO_PRES;
            System.out.println("non esiste\n");
            break;
      default:
            System.out.println("stato inesistente\n");
    }
  }
  public void consegna(String data)
  {
    setState(CONSEGNATO);
    datari = new String(data);
  }
  public String toString()
  {
    String s = new String ("scheda numero: " + n_sched);
    s += "\n" + automobile;
    s += "\nstato: " + stato;
    s += "\ndata arrivo: " + datarr;
    if (stato == RIPARATO)
      s += "\nRIPARATA";
    return s;
  }
}
