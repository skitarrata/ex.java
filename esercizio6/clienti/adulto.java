package clienti;
import javax.swing.JOptionPane;

public class adulto extends clienti
{
  private String code;
  protected adulto(){super();}
  
  public adulto(String nome, String cogn)
  {
    super(nome, cogn);
    this.code = JOptionPane.showInputDialog("codice fiscale:");
  }
  public String toString()
  {
    String s = "**************************\n";
    s += "\nnome: " + nome;
    s += "\ncognome: " + cogn;
    s += "\ndocumento: " + code;
    return (s);
  }
}
