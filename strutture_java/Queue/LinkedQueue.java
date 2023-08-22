package Queue;
import LinkedList.*;

public class LinkedQueue<E> implements Queue<E>
{
	private SinglyLinkedList_mod<E> list = new SinglyLinkedList_mod<>();
	public LinkedQueue(){}
	public int size(){ return list.size();}
	public boolean isEmpty(){return list.isEmpty();}
	public E first(){return list.first();}
	public void enqueue(E e){list.addFirst(e);}
	public E dequeue(){return list.removeFirst();}
}
