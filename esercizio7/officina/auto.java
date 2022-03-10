package officina;
import java.util.*;

public class auto
{
  private String targa;
  private String marca;
  private String modello;
  private String intes;
  private auto(){}
  auto(String targa, String marca, String modello)
  {
    this.targa = new String(targa);
    this.marca = new String(marca);
    this.modello = new String(modello);
    this.intes = new String("nessuno intestatario");
  }
  auto(String targa, String marca, String modello, String intes)
  {
    this(targa, marca, modello);
    this.intes = intes;
  }
  auto(auto a)
  {
    this.targa = new String(a.targa);
    this.marca = new String(a.marca);
    this.modello = new String(a.modello);
    this.intes = new String(a.intes);
  }

  public String gettarga(){return targa;}
  public String getmarca(){return marca;}
  public String getmodello(){return modello;}
  public String getintes(){return intes;}
  public void   copyTo(auto a){a = new auto(this)}

  public String toString(){return "targa: " + targa + "\nmarca: " + marca + "\nmodello: " + modello + "\nintestato a: " + intes;}
}
