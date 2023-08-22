package Stack;

public interface Stack<E>
{
	int size();
	boolean isEmpty();
	E top();
	E pop();
	void push(E element);
}