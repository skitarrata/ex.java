package LinkedList;

public interface LinkedList<E>
{
	int 	size();
	boolean isEmpty();
	E		first();
	E		last();
	void	addFirst(E e);
	void	addLast(E e);
	E		removeFirst();
	//il removeLast e troppo rischioso da fare, poichè per liste molto grandi bisognerebbe scorrere tutta
	//la lista per trovare la posizione del penultimo nodo 
}
