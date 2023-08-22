package PositionalList;
import java.util.*;

public interface Iterator<Position<E>>
{
	boolean		hasNext();
	Position<E>	next();
}
