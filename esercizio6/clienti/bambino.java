package clienti;
import javax.swing.JOptionPane;

public final class bambino extends clienti
{
  private String eta;
  clienti nomema;
  clienti nomepa;

  private bambino(){}
  public bambino(String nome, String cogn, clienti nomema, clienti nomepa)
  {
    super(nome, cogn);
    this.eta = JOptionPane.showInputDialog("età:");
    this.nomema = nomema;
    this.nomepa = nomepa;
  }
  public String toString()
  {
    String s = "**************************\n";
    s += "\nnome: " + nome;
    s += "\ncognome: " + cogn;
    s += "\netà: " + eta;
    s += "\nnome della madre: " + nomema;
    s += "\nnome del padre: " + nomepa;
    return (s);
  }
}
