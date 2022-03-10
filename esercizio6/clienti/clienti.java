package clienti;

public abstract class clienti
{
  protected String nome;
  protected String cogn;
  protected clienti(){}
  public clienti(String nome, String cogn)
  {
    this.nome = nome;
    this.cogn = cogn;
  }
  public abstract String toString();
}