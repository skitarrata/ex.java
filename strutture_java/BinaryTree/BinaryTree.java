package BinaryTree;
import java.util.*;
import Tree.*;

public interface BinaryTree<E> extends Iterable<E>
{
	Position<E> root();
	Position<E> parent(Position<E> p) throws IllegalArgumentException;
	Position<E> left(Position<E> p) throws IllegalArgumentException;
	Position<E> right(Position<E> p) throws IllegalArgumentException;
	Position<E> sibling(Position<E> p) throws IllegalArgumentException;
	Position<E> addRoot(E e) throws IllegalStateException;
	Position<E> addleft(Position<E> p, E e) throws IllegalArgumentException;
	Position<E> addright(Position<E> p, E e) throws IllegalArgumentException;
	Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;
	int numChildren(Position<E> p) throws IllegalArgumentException;
	boolean isInternal(Position<E> p) throws IllegalArgumentException;
	boolean isExternal(Position<E> p) throws IllegalArgumentException;
	boolean isRoot(Position<E> p) throws IllegalArgumentException;

	int size();
	boolean isEmpty();
	Iterator<E> iterator();
	Iterable<Position<E>> position();
}
