package bridge.example.di.context;

public class CircleContext extends Context {

	private final int x;
	private final int y;
	private final int r;

	public CircleContext(String type, int x, int y, int r) {
		super(type);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int x() {
		return x;
	}

	public int y() {
		return y;
	}

	public int r() {
		return r;
	}
}
