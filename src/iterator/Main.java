package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		MyCollection<Object> collection = new MyCollection<>();

		Iterator<Object> iterator = collection.iterator();
		// Iterator<Object> iterator = collection.reverseIterator();
		while (!iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}

		for (Object object : collection) {
			System.out.println(object);
		}
	}

}


