class Auto
{
	public int speed;
	public void accellera(){speed++;};
}

public class pasref
{
	public static void cambio(Auto s)
	{
		s.accellera();
		System.out.println("metodo :" + s.speed);
	}
	public static void main(String str[])
	{
		Auto s = new Auto();
		System.out.println("main1:" + s.speed);
		cambio(s);
		System.out.println("main2:" + s.speed);
	}
}
