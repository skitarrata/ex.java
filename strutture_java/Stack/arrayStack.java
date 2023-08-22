package Stack;

public class arrayStack<E> implements Stack<E>
{
	private E[] vet;
	private int index = -1;

	public arrayStack(int dim)
	{
		vet = (E[]) new Object[dim];
	}
	public int size(){return (index + 1);}
	public boolean isEmpty(){return index == -1;}
	public E pop()
	{
		if (isEmpty())
			return null;
		E tmp = vet[index];
		vet[index] = null;
		index--;
		return tmp;
	}
	public E top()
	{
		if (isEmpty())
			return null;
		return vet[index];
	}
	public void push(E e) throws IllegalStateException
	{
		if (size() == vet.length) throw new IllegalStateException("Stack is full");
		vet[++index] = e;
	}
}
