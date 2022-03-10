import calcoli.*;

public class area
{
	public float	a;
	triangoli tr = new triangoli();
	public area(String tip)
	{
		if (!(tip.equals("r") || tip.equals("q") || tip.equals("t")))
			System.out.println("manca il tipo\n");
	}
	private int setnum(String str)
	{
		if (!str.isEmpty())
			return(Integer.parseInt(str));
		else
			System.out.println("mancano i parametri\n");
		return (0);
	}
	public void result(float b, float h, String tip)
	{
		this.a = b * h;
		if (tip.equals("t"))
			this.a = tr.resulttr(this.a);
	}
	public static void main(String str[])
	{
		float	h;
		float	b;

		area pol = new area(str[2]);
		b = pol.setnum(str[0]);
		h = pol.setnum(str[1]);
		if (!(b == 0 || h == 0))
		{
			pol.result(b, h, str[2]);
			System.out.println(pol.a);
		}
		System.gc();
	}
}