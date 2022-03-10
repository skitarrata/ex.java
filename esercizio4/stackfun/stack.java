package stackfun;

public class stack
{
	private int[]	vet;
	private int		j;

	public stack(int n)
	{
		vet = new int[n];
		j = 0;
	}
	public stack(){this(20);}
	public void reset(){j = 0;}
	public boolean empty(){return j == 0;}
	public boolean full(){return j == vet.length;}
	public void finalize(){if (!empty()) System.out.println("eliminato stack non vuoto\n");}
	public boolean push(int i)
	{
		if (j < vet.length)
		{
			vet[j] = i;
			j++;
			return true;
		}
		else
			return false;
	}
	public int pop()
	{
		if (j > 0)
		{
			j--;
			return vet[j];
		}
		return 0;
	}
}