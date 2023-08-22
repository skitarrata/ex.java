package Tree;
import LinkedList.*;
public class GenTree<E> implements Tree<E> 
{
	private static class Node<E> implements Position<E>
	{
		private E element;
		private Node<E> parent;
		private ArrayList<Position<E>> childrens;

		public Node(E e, Node<E> p)
		{
			element = e;
			parent = p;
			childrens = new ArrayList<>();
		}
		public E getElement(){return element;}
		public Node<E> getParent(){return parent;}

		public void setElement(E e){element = e;}
		public void setParent(Node<E> n){parent = n;}
	}

	private class ElementIterator implements Iterator<E>
	{
		
	}

	protected Node<E> createNode(E e, Node<E> parent){return new Node<>(e, parent);}
	protected Node<E> root = null;
	private int size = 0;
	private Node<E> validate(Position<E> p) throws IllegalArgumentException
	{
		if (!(p instanceof Node))
			throw new IllegalArgumentException("invalid p");
		Node<E> node = (Node<E>) p;
		if (node.getParent() == null)
			throw new IllegalArgumentException("node root");
		return node;
	}

	public GenTree(){};

	public Position<E> root() {return root;}
	public Position<E> parent(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return node.getParent();
	}
	public int numChildren(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		int count = node.childrens.size();
		return count;
	}
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public boolean isInternal(Position<E> p) throws IllegalArgumentException{return numChildren(p) > 0;}
	public boolean isExternal(Position<E> p) throws IllegalArgumentException{return numChildren(p) == 0;}
	public boolean isRoot(Position<E> p) throws IllegalArgumentException{return p == root();}
	public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return node.childrens;
	}

	Iterator<E> iterator();
	Iterable<Position<E>> position();
}
