package bridge.example.di.factory;

import bridge.abstraction.Rectangle;
import bridge.abstraction.Shape;
import bridge.example.di.context.Context;
import bridge.example.di.context.RectangleContext;
import bridge.implementation.Drawer;

public class RectangleFactory implements ShapeFactory {

	private final Drawer drawer;

	public RectangleFactory(Drawer drawer) {
		this.drawer = drawer;
	}

	@Override
	public Shape create(Context context) {
		RectangleContext rectangleContext = (RectangleContext) context;
		return new Rectangle(drawer, rectangleContext.x1(), rectangleContext.y1(),
				rectangleContext.x2(), rectangleContext.y2());
	}
}
