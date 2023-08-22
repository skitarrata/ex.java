package Stack;
import LinkedList.*;

public class LinkedStack<E> implements Stack<E>
{
	private SinglyLinkedList_mod<E> list = new SinglyLinkedList_mod<>();
	public LinkedStack(){};
	public int size(){return list.size();}
	public boolean isEmpty(){return list.isEmpty();}
	public E pop(){return list.removeFirst();}
	public E top(){return list.first();}
	public void push(E e){list.addFirst(e);}
}
