package bridge.abstraction;

import bridge.implementation.Drawer;

public class Rectangle implements Shape {

	private final Drawer drawer;
	private final int x1;
	private final int y1;
	private final int x2;
	private final int y2;

	public Rectangle(Drawer drawer, int x1, int y1, int x2, int y2) {
		this.drawer = drawer;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public void draw() {
		drawer.drawRectangle(x1, y1, x2, y2);
	}
}
