import clienti.*;
import camere.*;
import java.util.*;
import javax.swing.JOptionPane;

public class gestione
{
	public static void main(String arg[])
	{
		int r;
		String s;
		String nome;
		String cogn;
		ArrayList<normale> vet = new ArrayList<normale>();
		do
		{
			r = Integer.parseInt(JOptionPane.showInputDialog("scegli un operazione:\n1: infocamera\n2: affitta camera\n3: esci\n"));
			switch(r)
			{
				case 1:
						s = JOptionPane.showInputDialog("di quale camera si vuole sapere le info:\nn: normale\nl: lusso\ne:extralusso\n");
						if (s.equals("n"))
							normale.info();
						else if (s.equals("l"))
							lusso.info();
						else if (s.equals("e"))
							extralusso.info();
						else
							System.out.println("noinfo\n");
						break;
				case 2:
						s = JOptionPane.showInputDialog("quale camera vuoi affittare:\nn: normale\nl: lusso\ne:extralusso\n");
						if (s.equals("n"))
						{
							vet.add(new normale(2));
							nome = JOptionPane.showInputDialog("nome del adulto\n");
							cogn = JOptionPane.showInputDialog("cognome del adulto\n");
							vet.get(normale.count).arr.add(new adulto(nome, cogn));
							System.out.println(vet.get(normale.count).arr.get(0));
						}
						else if (s.equals("l"))
						{
							vet.add(new lusso(4));
							nome = JOptionPane.showInputDialog("nome del bambino\n");
							cogn = JOptionPane.showInputDialog("cognome del bambino\n");
							vet.get(normale.count).arr.add(new adulto(nome, cogn));
							System.out.println(vet.get(normale.count).arr.get(0));
						}
						else if (s.equals("e"))
						{
							vet.add(new extralusso(6));
							nome = JOptionPane.showInputDialog("nome del ragazzo\n");
							cogn = JOptionPane.showInputDialog("cognome del ragazzo\n");
							vet.get(normale.count).arr.add(new ragazzo(nome, cogn));
							System.out.println(vet.get(normale.count).arr.get(0));
						}
						else
							System.out.println("non esiste la stanza\n");
						normale.count++;
						break;
				case 3:
						System.exit(1);
						break;
			}
		}
		while(r != 3);
	}
}