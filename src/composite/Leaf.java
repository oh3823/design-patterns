package composite;

public class Leaf implements Component {

	private final String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void ls(String prefix) {
		System.out.println(prefix + "/" + name);
	}
}
