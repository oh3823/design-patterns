package bridge.example.non_di;

import bridge.abstraction.Circle;
import bridge.abstraction.Rectangle;
import bridge.implementation.DirectXDrawer;
import bridge.implementation.Drawer;
import bridge.implementation.OpenGLDrawer;

public class Client {

	public static void main(String[] args) {
		Drawer openGLDrawer = new OpenGLDrawer();
		Drawer directXDrawer = new DirectXDrawer();

		Circle circle = new Circle(directXDrawer, 3, 3, 3);
		circle.draw();
		Rectangle rectangle = new Rectangle(openGLDrawer, 1, 1, 2, 2);
		rectangle.draw();
	}
}