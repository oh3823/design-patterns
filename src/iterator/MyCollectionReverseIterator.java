package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollectionReverseIterator<E> implements Iterator<E> {

	private final MyCollection<E> list;
	private int index;

	public MyCollectionReverseIterator(MyCollection<E> list) {
		this.list = list;
		index = list.size() - 1;
	}

	@Override
	public boolean hasNext() {
		return index >= 0;
	}

	@Override
	public E next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return list.at(index--);
	}
}
