package PositionalList;

public class LinkedPositionalList<E> implements PositionalList<E>
{
	private static class Node<E> implements Position<E>
	{
		private	E elem;
		private Node<E> prev;
		private Node<E> next;

		public Node(E e, Node<E> p, Node<E> n)
		{
			elem = e;
			prev = p;
			next = n;
		}

		public E			getElement() throws IllegalStateException
		{
			if (next == null)
				throw new IllegalStateException("position not valid");
			return elem;
		}
		public Node<E>	getPrev(){ return prev; }
		public Node<E>	getNext(){return next; }
		public void		setElement(E e){ elem = e; }
		public void		setPrev(Node<E> p){ prev = p; }
		public void		setNext(Node<E> n){ next = n; }
	}
	private int size = 0;
	private Node<E> header;
	private Node<E> trailer;

	private Position<E> position(Node<E> n)
	{
		if (n == header || n == trailer)
			return null;
		return n;
	}
	private Node<E> validate(Position<E> p) throws IllegalArgumentException
	{
		if(!(p instanceof Node))
			throw new IllegalArgumentException("Position not valid");
		Node<E> node = (Node<E>) p;
		if (node.getNext() == null)
			throw new IllegalArgumentException("p is no longer in the list");
		return node;
	}
	public LinkedPositionalList()
	{
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
	public int			size(){return size;}
	public boolean		isEmpty(){return size == 0;}
	public Position<E>	first(){return position(header.getNext());}
	public Position<E>	last(){return position(trailer.getPrev());}
	public Position<E>	before(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return position(node.getPrev());
	}
	public Position<E>	after(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return position(node.getNext());
	}

	private Position<E>	addBetween(E e, Node<E> pre, Node<E> suc)
	{
		Node<E> n = new Node<>(e, pre, suc);
		pre.setNext(n);
		suc.setPrev(n);
		size++;
		return n;
	}

	public Position<E>	addFirst(E e){return addBetween(e, header, header.getNext())}
	public Position<E>	addLast(E e){return addBetween(e, trailer.getPrev(), trailer)}
	public Position<E>	addBefore(Position<E> p, E e) throws IllegalArgumentException
	{
		Node<E> n = validate(p);
		return addBetween(e, n.getPrev(), n);
	}
	public Position<E>	addAfter(Position<E> p, E e) throws IllegalArgumentException
	{
		Node<E> n = validate(p);
		return addBetween(e, n, n.getNext());
	}
	public E			set(Position<E> p, E e) throws IllegalArgumentException
	{
		Node<E> n = validate(p);
		E tmp = n.getElement();
		n.setElement(e);
		return tmp;
	}
	public E			remove(Position<E> p) throws IllegalArgumentException
	{
		Node<E> n = validate(p);
		Node<E> pred = n.getPrev();
		Node<E> nex = n.getNext();
		E tmp = n.getElement();
		pred.setNext(nex);
		nex.setPrev(pred);
		size--;
		n.setNext(null);
		n.setPrev(null);
		n.setElement(null);
		return tmp;
	}

	private class PositionIterator implements Iterator<Position<E>>
	{
		
	}

	public Iterator<E> iterator();
	public Iterable<Position<E>> position();
}
