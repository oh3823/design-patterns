package composite;

public interface Component {

	String getName();

	void ls(String prefix);

	default void ls() {
		ls("");
	}

	default void add(Component component) {
		throw new RuntimeException();
	}
}
