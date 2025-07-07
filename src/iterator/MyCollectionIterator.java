package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollectionIterator<E> implements Iterator<E> {

	private final MyCollection<E> list;
	private int index;

	public MyCollectionIterator(MyCollection<E> list) {
		this.list = list;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < list.size();
	}

	@Override
	public E next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return list.at(index++);
	}
}
