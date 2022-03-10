package gestione;
import  java.io.*;
import  java.lang.*;
import  java.util.*;

public class rubrica implements struttura
{
  public static  int count = 0;
  public rubrica(){}
  //public rubrica(String n, String c, String num){super(n, c, num);}
  private ArrayList<contatti> c = new ArrayList<contatti>();

  public void addContact(contatti contact)
  {
    if (count == max)
    {
      System.out.println("non posso aggiungere contatti, limite raggiunto\n");
      return;
    }
    if(contact != null)
    {
      c.add(contact);
      count++;
    }
  }

  public void deleteContact(int pos)
  {
    if (count == 0)
    {
      System.out.println("non ci sono elementi da eliminare\n");
      return;
    }
    if(c.get(pos) != null)
    {
      c.remove(pos);
      count--;
    }
  }

  public void searchName(String n)
  {
    for(int i = 0; i < c.size(); i++)
      if(c.get(i).nome.equals(n))
      {
        System.out.println("pos: " + i + "\n");
        System.out.println(c.get(i).toString());
      }
  }

  public void searchCogn(String co)
  {
    for(int i = 0; i < c.size(); i++)
      if(c.get(i).nome.equals(co))
      {
        System.out.println("pos: " + i + "\n");
        System.out.println(c.get(i).toString());
      }
  }

  public void writeRubrica(String file)
  {
    try
    {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      for(int i = 0; i < c.size(); i++)
         out.println(c.get(i).toString());
      out.close();
    }
    catch (EOFException e){System.err.println("End of stream");}
    catch (Exception e){e.printStackTrace();}
  }

  public void readRubrica(String file)
  {
    try
    {
      BufferedReader in = new BufferedReader(new FileReader(file));
      String buf = new String();
      while ((buf = in.readLine()) != null)
        System.out.println(buf);
    }
    catch (EOFException e){System.err.println("End of stream");}
    catch (Exception e){e.printStackTrace();}
  }

}
