package bridge.example.di;

import bridge.abstraction.Shape;
import bridge.example.di.context.Context;
import bridge.example.di.factory.ShapeFactory;
import java.util.Map;

public class Client {

	private final Map<String, ShapeFactory> factoryMap;

	public Client(Map<String, ShapeFactory> factoryMap) {
		this.factoryMap = factoryMap;
	}

	public void draw(Context context) {
		ShapeFactory factory = factoryMap.get(context.type());
		Shape shape = factory.create(context);
		shape.draw();
	}
}
