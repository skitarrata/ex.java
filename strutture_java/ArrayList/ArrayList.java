package ArrayList;

public class ArrayList<E> implements List<E>
{
	private E[] arr;
	private int size = 0;
	private void checkIndex(int i, int sz) throws IndexOutOfBoundsException
	{
		if (i > sz || i < 0)
			throw new IndexOutOfBoundsException("Index fail");
		return;
	}

	public ArrayList(int dim){ arr = (E[]) new Object[dim]; }
	public int		size(){ return size; }
	public boolean	isEmpty(){return size == 0;}
	public E		get(int i) throws IndexOutOfBoundsException
	{
		checkIndex(i, size);
		return arr[i];
	}
	public E		set(int i, E e) throws IndexOutOfBoundsException
	{
		checkIndex(i, size);
		E tmp = arr[i];
		arr[i] = e;
		return tmp;
	}
	public void		add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException
	{
		checkIndex(i, size + 1);
		if (size == arr.length)
			throw new IllegalStateException("array is full");
		for (int j = size - 1; j >= i; j--)
			arr[j + 1] = arr[j];
		arr[i] = e;
		size++;
		return;
	}
	public E		remove(int i) throws IndexOutOfBoundsException
	{
		checkIndex(i, size);
		E tmp = arr[i];
		for(int j = i; j < size - 1; j++)
			arr[j] = arr[j + 1];
		arr[size - 1] = null;
		size--;
		return tmp;
	}
}
