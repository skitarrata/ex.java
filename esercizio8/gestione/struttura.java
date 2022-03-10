package gestione;

interface struttura
{
  int max = 20;

  void   addContact(contatti contact);
  void   deleteContact(int pos);
  void   searchName(String n);
  void   searchCogn(String co);
  void   writeRubrica(String file);
  void   readRubrica(String file);
}
