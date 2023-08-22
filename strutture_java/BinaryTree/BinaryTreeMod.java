package BinaryTree;

import Tree.Position;

public class BinaryTreeMod<E> implements BinaryTree<E>
{
	private static class Node<E> implements Position<E>
	{
		private Node<E> parent;
		private Node<E> left;
		private Node<E> right;
		private E element;

		public Node(E e, Node<E> above, Node<E> l, Node<E> r)
		{
			element = e;
			parent = above;
			left = l;
			right = r;
		}

		public E getElement(){return element;}
		public Node<E> getParent(){return parent;}
		public Node<E> getLeft(){return left;}
		public Node<E> getRight(){return right;}

		public void setElement(E e){element = e;}
		public void setParent(Node<E> n){parent = n;}
		public void setLeft(Node<E> l){left = l;}
		public void setRight(Node<E> r){right = r;}
	}
	protected Node<E> createNode(E e, Node<E> pa, Node<E> le, Node<E> ri){return new Node<>(e, pa, le, ri);}
	private int size = 0;
	protected Node<E> root = null;
	public BinaryTreeMod(){};
	protected Node<E> validate(Position<E> p) throws IllegalArgumentException
	{
		if(!(p instanceof Node))
			throw new IllegalArgumentException("illegal position");
		Node<E> res = (Node<E>) p;
		if (res.getParent() == null)
			throw new IllegalArgumentException("node root");
		return res;
	}

	public Position<E> root(){return root;}
	public Position<E> parent(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return node.getParent();
	}
	public Position<E> left(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return node.getLeft();
	}
	public Position<E> right(Position<E> p) throws IllegalArgumentException
	{
		Node<E> node = validate(p);
		return node.getRight();
	}
	public Position<E> sibling(Position<E> p) throws IllegalArgumentException
	{
		Position<E> parent = parent(p);
		if (parent == null)
			return null;
		if (p == left(parent))
			return right(parent);
		else
			return left(parent);
	}
	public Position<E> addRoot(E e) throws IllegalStateException
	{
		if(!isEmpty())
			throw new IllegalStateException("tree is not empty");
		root = createNode(e, null, null, null);
		size++;
		return root;
	}
	public Position<E> addleft(Position<E> p, E e) throws IllegalArgumentException
	{
		Node<E> parent = validate(p);
		if (parent.getLeft() != null)
			throw new IllegalArgumentException("child left occupated");
		Node<E> child = createNode(e, parent, null, null);
		parent.setLeft(child);
		size++;
		return child;
	}
	public Position<E> addright(Position<E> p, E e) throws IllegalArgumentException
	{
		Node<E> parent = validate(p);
		if (parent.getRight() != null)
			throw new IllegalArgumentException("child right occupated");
		Node<E> child = createNode(e, parent, null, null);
		parent.setRight(child);
		size++;
		return child;
	}
	public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;
	public int size(){return size;}
	public boolean isEmpty(){return size == 0;}
	public Iterator<E> iterator();
	public Iterable<Position<E>> position();
}
