import gestione.*;
import javax.swing.*;

public class myrubrica
{
  public static void main(String []argv)
  {
    int r;
    rubrica rub = new rubrica();
    String nome;
    String cogn;
    String numero;
		do
		{
			r = Integer.parseInt(JOptionPane.showInputDialog("scegli un operazione:\n1: aggiungi contatto\n2: rimuovi contatto\n3: cerca per nome\n4: add rubrica\n5: read rubrica\n6: esci\n"));
			switch(r)
			{
				case 1:
						nome = JOptionPane.showInputDialog("inserisci nome\n");
            cogn = JOptionPane.showInputDialog("inserisci cognome\n");
            numero = JOptionPane.showInputDialog("inserisci numero\n");
            contatti c = new contatti(nome, cogn, numero);
            rub.addContact(c);
						break;
				case 2:
						int f;
            f = Integer.parseInt(JOptionPane.showInputDialog("in che posizione si trova il contatto ?\n"));
            rub.deleteContact(f);
						break;
        case 3:
            String s;
            s = JOptionPane.showInputDialog("che nome stai cercando ?\n");
            rub.searchName(s);
            break;
        case 4:
            rub.writeRubrica("prova.txt");
            break;
        case 5:
            rub.readRubrica("prova.txt");
            break;
				case 6:
						System.exit(1);
						break;
			}
		}
		while(r != 6);
  }
}
