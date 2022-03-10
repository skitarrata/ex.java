import dispositivi.*;
import javax.swing.*;
import  java.io.*;
import  java.lang.*;
import  java.util.*;

public class test
{
  public static void main(String []argv)
  {
    ArrayList arr = new ArrayList();
    String tipo;
    String marca;
    tipo = JOptionPane.showInputDialog("inserisci tipo lampadina\n");
    marca = JOptionPane.showInputDialog("inserisci marca lampadina\n");
    lampadina i = new lampadina(tipo, marca);
    arr.add(i);
    tipo = JOptionPane.showInputDialog("inserisci tipo lavatrice\n");
    marca = JOptionPane.showInputDialog("inserisci marca lavatrice\n");
    lavatrice z = new lavatrice(tipo, marca);
    arr.add(z);
    for (int j = 0; j < arr.size(); j++)
    {
      arr.get(j).signal(1000);
      arr.get(j).start(10);
      arr.get(j).pause();
      arr.get(j).stop();
      write_file("text.txt");
    }
  }
  public static void write_file(String file)
  {
    try
    {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      for(int i = 0; i < arr.size(); i++)
         out.println(arr.get(i).toString());
      out.close();
    }
    catch (EOFException e){System.err.println("End of stream");}
    catch (Exception e){e.printStackTrace();}
  }
}
