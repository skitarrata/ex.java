/* import java.lang.*;

public interface mergeSort<K>
{
	void mergeSort(K[] s, Comparator<K> comp);
	void merge(K[] s1,K[] s2,K[] s, Comparator<K> comp);
} */

public static <K> void merge(K[] s1,K[] s2,K[] s, Comparator<K> comp)
{
	int i = 0, j = 0;
	while(i + j < s.length)
	{
		if (j == s2.length || (i < s1.length && comp.compare(s1[i], s2[j]) < 0))
			s[i + j] = s1[i++];
		else
			s[i + j] = s2[j++];
	}
}

public static <K> void mergeSort(K[] s, Comparator<K> comp)
{
	int n = s.length;
	if (n < 2)
		return;
	int mid = n / 2;
	K[] s1 = arrays.copyOfRange(s, 0, mid);
	K[] s2 = arrays.copyOfRange(s, mid, n);
	
	mergeSort(s1, comp);
	mergeSort(s2, comp);

	merge(s1, s2, s, comp);
}