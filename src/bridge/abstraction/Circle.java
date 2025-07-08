package bridge.abstraction;

import bridge.implementation.Drawer;

public class Circle implements Shape {

	private final Drawer drawer;
	private final int x;
	private final int y;
	private final int r;

	public Circle(Drawer drawer, int x, int y, int r) {
		this.drawer = drawer;
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public void draw() {
		drawer.drawCircle(x, y, r);
	}
}
