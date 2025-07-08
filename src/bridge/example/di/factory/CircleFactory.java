package bridge.example.di.factory;

import bridge.abstraction.Circle;
import bridge.abstraction.Shape;
import bridge.example.di.context.CircleContext;
import bridge.example.di.context.Context;
import bridge.implementation.Drawer;

public class CircleFactory implements ShapeFactory {

	private final Drawer drawer;

	public CircleFactory(Drawer drawer) {
		this.drawer = drawer;
	}

	@Override
	public Shape create(Context context) {
		CircleContext circleContext = (CircleContext) context;
		return new Circle(drawer, circleContext.x(), circleContext.y(), circleContext.r());
	}
}
