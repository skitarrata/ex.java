import java.util.Date;
import javax.swing.JOptionPane;

public class database
{
	public static void main(String[] arg)
	{
		String n = JOptionPane.showInputDialog("nome:");
		String c = JOptionPane.showInputDialog("cognome: ");
		String e = JOptionPane.showInputDialog("esami sostenuti: ");
		studente s = new studente(n, c, e);
		System.out.println(s);
	}
}

class professore
{
	protected String	nome;
	protected String	cogn;
	protected Date		d;
	protected professore(){}
}

class studente extends professore
{
	private int	mat;
	private int	count = 0;
	private String	esami;
	private studente(){super();}

	public studente(String nome, String cogn, String esami)
	{
		this.nome = nome;
		this.cogn = cogn;
		this.esami = esami;
		count++;
		mat = count;
		d = new Date();
	}

	public String toString()
	{
		String s = "*********************\n";
		s += "nome: " + nome;
		s += "\ncognome: " + cogn;
		s += "\nmatricola: " + mat;
		s += "\nesami sostenuti: " + esami;
		s += "\ndata accesso: " + d;
		return s;
	}
}