package camere;
import clienti.*;
import java.util.*;

public class normale implements camere
{
	public static int count = 0;
	protected int stato = pulita;
	protected int mod = libera;
	final int posti;
	public ArrayList<clienti> arr;
	public normale(int posti)
	{
		this.posti = posti;
		arr = new ArrayList<clienti>();
	}
	public static void info(){System.out.println("la stanza contiene:\ntv\n2 letti\nbagno\ncucina\n");}
	public void pulisci()
	{
		if (stato == sporca)
		{
			stato = pulita;
			System.out.println("la stanza è pulita\n");
		}
	}
	public int getmod(){return mod;}
	public int getstato(){return stato;}
	public void setstato(int c){stato = c;}
	public void setmod(int c){mod = c;}
}
