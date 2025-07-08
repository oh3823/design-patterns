package bridge.example.di.context;

public class RectangleContext extends Context {

	private final int x1;
	private final int y1;
	private final int x2;
	private final int y2;

	public RectangleContext(String type, int x1, int y1, int x2, int y2) {
		super(type);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public int x1() {
		return x1;
	}

	public int y1() {
		return y1;
	}

	public int x2() {
		return x2;
	}

	public int y2() {
		return y2;
	}

}
