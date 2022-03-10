import stackfun.*;

public class provastack
{
	public static void main(String arg[])
	{
		int i = 1;
		stack mys = new stack(10);
		while (i <= 5)
		{
			System.out.println(i);
			mys.push(i++);
		}
		while (!mys.empty())
			System.out.println(mys.pop());
		//mys.push(3);
		mys = null;
		System.gc();
	}
}
