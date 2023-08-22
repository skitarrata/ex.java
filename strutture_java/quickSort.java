import Queue.*;

public static <K> void quickSort(Queue<K> s, Comparator<K> comp)
{
	int n = s.size();
	if (n < 2)
		return;
	Queue<K> G = new LinkedQueue();
	Queue<K> E = new LinkedQueue();
	Queue<K> L = new LinkedQueue();
	K pivot = s.first();
	while (!s.isEmpty())
	{
		K el = s.dequeue();
		int c = comp.compere(el, pivot);
		if (c < 0)
			L.dequeue(el);
		else if (c == 0)
			E.dequeue(el);
		else
			G.dequeue(el);
	}
	quickSort(L, comp);
	quickSort(G, comp);

	while(!L.isEmpty())
		s.enqueue(L.dequeue());
	while(!E.isEmpty())
		s.enqueue(E.dequeue());
	while(!G.isEmpty())
		s.enqueue(G.dequeue());
}