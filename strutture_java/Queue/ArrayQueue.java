package Queue;

public class ArrayQueue<E> implements Queue<E>
{
	private E[] vet;
	private int f = 0;
	private int sz = 0;

	public ArrayQueue(int dim)
	{
		vet = (E[]) new Object[dim];
	}
	public int size(){ return sz;}
	public boolean isEmpty(){return sz == 0;}
	public E first()
	{
		if (isEmpty())
			return null;
		return vet[f];
	}
	public void enqueue(E e) throws IllegalStateException
	{
		if (sz == vet.length) throw new IllegalStateException("Queue is full");
		int res = (sz + f)% vet.length;
		vet[res] = e;
		sz++; 
	}
	public E dequeue()
	{
		if (isEmpty())
			return null;
		E tmp = vet[f];
		vet[f] = null;
		f = (f + 1)% vet.length;
		sz--;
		return tmp;
	}
}
