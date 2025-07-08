package bridge.implementation;

public class DirectXDrawer implements Drawer {

	@Override
	public void drawCircle(int x, int y, int r) {
		System.out.println("Drawing Circle with DirectX at (" + x + "," + y + ") with radius " + r);
	}

	@Override
	public void drawRectangle(int x1, int y1, int x2, int y2) {
		System.out.println(
				"Drawing Rectangle with DirectX at (" + x1 + "," + y1 + ") to" + " (" + x2 + ","
						+ y2 + ")");
	}
}
