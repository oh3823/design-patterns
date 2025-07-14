package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private final String name;
	private final List<Component> dir;

	public Composite(String name) {
		this.name = name;
		this.dir = new ArrayList<>();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void ls(String prefix) {
		System.out.println(prefix + "/" + name);
		dir.forEach(component -> component.ls(prefix + "/" + name));
	}

	@Override
	public void add(Component component) {
		dir.add(component);
	}
}
