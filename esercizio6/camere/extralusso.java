package camere;

public class extralusso extends lusso
{
	public extralusso(int c){super(c);}
	public static void info()
	{
		lusso.info();
		System.out.println("salotto\nsala per ospiti\n");
	}
}

