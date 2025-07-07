package iterator;

import java.util.Iterator;

public class MyCollection<T> implements Iterable<T> {

	private T[] elements;

	@Override
	public Iterator<T> iterator() {
		return new MyCollectionIterator<>(this);
	}

	public Iterator<T> reverseIterator() {
		return new MyCollectionReverseIterator<>(this);
	}

	public int size() {
		return elements.length;
	}

	public T at(int index) {
		return elements[index];
	}
}
