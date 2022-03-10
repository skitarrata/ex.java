public class pasval
{
	public static void cambia(String s)
	{
		s = s.concat(" mondo");
		System.out.println("metodo :" + s);
	}
	public static void main(String str[])
	{
		String s = "ciao";
		System.out.println("main1:" + s);
		cambia(s);
		System.out.println("main2:" + s);
	}
}