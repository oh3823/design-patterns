package bridge.example.di.context;

public class Context {

	private final String type;

	public Context(String type) {
		this.type = type;
	}

	public String type() {
		return type;
	}

}


