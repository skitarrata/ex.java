package LinkedList;

public class SinglyLinkedList_mod<E> implements LinkedList<E>
{
	private static class Node<E>
	{
		private E		elem;
		private Node<E>	next;
		public 	Node(E e, Node<E> n)
		{
			elem = e;
			next = n;
		}
		public E		getElement(){return elem;}
		public Node<E>	getNext(){return next;}
		public void		setNext(Node<E> n){next = n;}
	}
	private int		size = 0;
	private Node<E> head = null;
	private Node<E> tail = null;
	public SinglyLinkedList_mod(){}
	public int 	size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public E	first()
	{
		if (isEmpty())
			return null;
		return head.getElement();
	}
	public E	last()
	{
		if (isEmpty())
			return null;
		return tail.getElement();
	}
	public void	addFirst(E e)
	{
		head = new Node<>(e, head);
		if (isEmpty())
			tail = head;
		size++;
	}
	public void	addLast(E e)
	{
		Node<E> newn = new Node<>(e, null);
		if (isEmpty())
			head = newn;
		else
			tail.setNext(newn);
		tail = newn;
		size++;
	}
	public E	removeFirst()
	{
		if (isEmpty())
			return null;
		E tmp = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return tmp;
	}
}