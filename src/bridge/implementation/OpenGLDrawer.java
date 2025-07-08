package bridge.implementation;

public class OpenGLDrawer implements Drawer {

	@Override
	public void drawCircle(int x, int y, int r) {
		System.out.println("Drawing Circle with OpenGL at (" + x + "," + y + ") with radius " + r);
	}

	@Override
	public void drawRectangle(int x1, int y1, int x2, int y2) {
		System.out.println(
				"Drawing Rectangle with OpenGL at (" + x1 + "," + y1 + ") to" + " (" + x2 + ","
						+ y2 + ")");
	}
}
