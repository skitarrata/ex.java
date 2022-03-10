package officina;
import java.util.*

public class officina
{
  public ArrayList<scheda> sh = new ArrayList<scheda>();
  officina(){}
  public void addscheda(scheda s)
  {
    if (s != null)
      sh.add(s);
  }

  public void printveicoli(String file)
  {
    try
    {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      for(int i = 0; i < sh.size(); i++)
          out.println((scheda)sh.get(i));
      out.close();
    }
    catch (EOFException e){System.err.println("End of stream");}
    catch (Exception e){e.printStackTrace();}
  }

  public void printveicoloriparazione(String file)
  {
    try
    {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      for(int i = 0; i < sh.size(); i++)
      {
        scheda sd = (scheda)sh.get(i);
        if (sd.getState() == scheda.IN_RIP)
            out.println((scheda)sh.get(i));
      }
      out.close();
    }
    catch (EOFException e){System.err.println("End of stream");}
    catch (Exception e){e.printStackTrace();}
  }

  public void printveicoloconsegnato(String file)
  {
    try
    {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
      for(int i = 0; i < sh.size(); i++)
      {
        scheda sd = (scheda)sh.get(i);
        if (sd.getState() == scheda.CONSEGNATO)
            out.println((scheda)sh.get(i));
      }
      out.close();
    }
    catch (EOFException e){System.err.println("End of stream");}
    catch (Exception e){e.printStackTrace();}
  }

  public void readveicoli(String file)
  {
    try
    {
      BufferedReader in = new BufferedReader(new FileReader(file));
      String targa = new String();
      String marca = new String();
      String modello = new String();
      String intest = new String();
      while ((targa = in.readLine()) != null)
      {
        marca = in.readLine();
        modello = in.readLine();
        intest = in.readLine();
        auto a = new auto(targa, marca, modello, intest);
        scheda s = new scheda(a, "OGGI");
        s.setState(scheda.IN_RIP);
      }
      in.close();
    }
    catch (Exception e){e.printStackTrace();}
  }
  public void veicolitrattati(String file)
  {
    try
    {
      DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
      out.writeInt((sh.get(0)).n_autotratt);
      out.close();
    }
    catch(Exception e){e.printStackTrace();}
  }

  public void readveicolitrattati(String file)
  {
    try
    {
      DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
      //in.writeInt((sh.get(0)).n_autotratt);
      in.close();
    }
    catch(Exception e){e.printStackTrace();}
  }
}
